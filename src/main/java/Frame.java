import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frame {
	private List<Integer> pins = new ArrayList<>();
	private Map<Integer, Integer> pin = new HashMap<>();
	private int nextPin1 = 0;// 次の1投目。スペア・ストライクの得点計算用
	private int nextPin2 = 0;// 次の2投目。ストライクの得点計算用
	private int curentPin = 0;// 倒したピンの数

	/** フレームのスコアを返します。 */
	public int getScore() {
		return curentPin + nextPin1 + nextPin2;
	}

	/** フレームで倒したピンの合計を返します。 */
	public int getSumPins() {
		return getPins().stream().mapToInt(p -> p).sum();
	}

	/** 次の1投目に倒したピンの数を設定します。スペア・ストライクの得点計算用。 */
	public void setFirstNextpin(int nextpin) {
		this.nextPin1 = nextpin;
	}

	/** 次の2投目に倒したピンの数を設定します。ストライクの得点計算用。 */
	public void setSecondtNextpin(int nextpin) {
		this.nextPin2 = nextpin;
	}

	/** スペアが出たかどうかを返します。 */
	public boolean isSpare() {
		return !isStrike() && (getPins().get(0) + getPins().get(1) == 10);
	}

	/** ストライクが出たかどうかを返します。 */
	public boolean isStrike() {
		return getPins().get(0) == 10;
	}

	/** 何投目か、倒したピンの数を追加します。 */
	public void addPin(int pitch, int pin) {
		getPins().add(pin);
		getPin().put(pitch, pin);
		curentPin += pin;
	}

	public List<Integer> getPins() {
		return pins;
	}
	public Map<Integer, Integer> getPin() {
		return pin;
	}
}