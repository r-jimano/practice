import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

class Game {
    private List<Frame> frames = new ArrayList<>();
    private int[] pins;
    int currentFrame = 1;
    boolean isThrown = false;

    public void play(int[] p) {
	this.pins = p;
	Frame f = null;

	for (int i = 0; i < pins.length; i++) {
	    if (!isThrown) {
		f = new Frame();
	    }
	    // フレームごとにピンを格納
	    isThrown = bowling(f, i, pins[i]);
	}
	getFrames().add(f);// 最終フレームのピン

	setNextPins(frames);
    }

    public List<Frame> getFrames() {
	return frames;
    }

    /** このゲームで倒したピンの数の合計 */
    public int getSumPins() {
	return getFrames().stream().mapToInt(f -> f.getSumPins()).sum();
    }

    /**
     * ※ストライクの場合だけでなく、各フレームの1投目が0本、2投目で10本倒した場合もカウントします。
     * 
     * @return 1回の投球で10本倒した回数
     */
    public int getCountTenPin() {
	int cnt = (int) getFrames().stream().flatMap(f -> f.getPins().stream()).mapToInt(p -> p).filter(p -> p == 10)
		.count();
	return cnt;
    }

    /** 第1フレームのスコア */
    public int getFirstFrameScore() {
	Frame first = getFrames().get(0);
	if (first.isStrike()) {
	    return first.getScore() + getFrames().get(1).getPins().get(0);
	}
	return first.getScore();
    }

    /** このゲームの全10フレームの第1投で倒したピンの数の平均 */
    public BigDecimal getAvgFirstThrow() {
	long sum = getFrames().stream().mapToLong(f -> f.getPins().get(0)).sum();
	BigDecimal size = new BigDecimal(getFrames().size());
	BigDecimal avg = new BigDecimal(sum).divide(size, 1, RoundingMode.HALF_EVEN);
	return avg;
    }

    /** このゲームのスペアの回数 */
    public long getCntSpare() {
	return getFrames().stream().filter(f -> f.isSpare()).count();
    }

    /** このゲームの最終スコア */
    public int getScore() {
	return getFrames().stream().mapToInt(f -> f.getScore()).sum();
    }

    /** このゲームのスコア表 */
    @Override
    public String toString() {
	return null;
    }

    /** 投げる */
    private boolean bowling(Frame f, int pitch, int pin) {
	f.addPin(pitch, pin);
	if (currentFrame < 10) {
	    if (f.isStrike() || isThrown) {
		getFrames().add(f);
		currentFrame++;
		return false;// to next Frame
	    } else {
		return true;// 次は二投目
	    }
	} else {
	    return true;// 最終フレーム
	}
    }

    /** 得点計算用に、次の1投・2投で倒したピンをセット */
    private void setNextPins(List<Frame> frames) {
	for (int i = 0; i < frames.size() - 1; i++) {
	    Frame current = frames.get(i);
	    if (current.isSpare()) {
		Frame later = frames.get(i + 1);
		current.setFirstNextpin(later.getPins().get(0));
	    }
	    if (current.isStrike()) {
		_setNextPins(current, i);
	    }
	}
    }

    private void _setNextPins(Frame current, int cntFrame) {
	Frame later = frames.get(cntFrame + 1);
	current.setFirstNextpin(later.getPins().get(0));

	if (later.isStrike()) {
	    if (cntFrame < frames.size() - 3) {
		Frame later2 = frames.get(cntFrame + 2);
		current.setSecondtNextpin(later2.getPins().get(0));
	    } else {
		current.setSecondtNextpin(pins[pins.length - 2]);
	    }
	} else {
	    current.setSecondtNextpin(later.getPins().get(1));
	}
    }

}