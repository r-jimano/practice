/**
 * ボーリング1ゲームの各投球での倒したピンの数が与えられた時、以下の値を表示するプログラム
 */
public class Bowling {
    public static void main(String[] args) {
	Game g = new Game();
	g.play(parseArgs(args));

	// 1. このゲームで倒したピンの数の合計
	System.out.println("1." + g.getSumPins());
	// 2. 1回の投球で10本倒した回数
	System.out.println("2." + g.getCountTenPin());
	// 3. 第1フレームのスコア
	System.out.println("3." + g.getFirstFrameScore());
	// 4. このゲームの全10フレームの第1投で倒したピンの数の平均
	System.out.println("4." + g.getAvgFirstThrow());
	// 5. このゲームのスペアの回数
	System.out.println("5." + g.getCntSpare());
	// 6. このゲームの最終スコア
	System.out.println("6." + g.getScore());
	// 7. このゲームのスコア表
	System.out.println("7." + g);
    }

    static int[] parseArgs(String[] args) {
	int[] p = new int[args.length];
	for (int i = 0; i < args.length; i++) {
	    p[i] = Integer.parseInt(args[i]);
	}
	return p;
    }
}