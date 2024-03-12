package webplayer;

public class Game {
	public static void main(String []args) {
		pocman pocc = new pocman();
		gamerunner game = new gamerunner(pocc);
	}
}
class gamerunner{
	pocman poc;
	public gamerunner(pocman poc) {
		poc.up();
		poc.down();
		poc.right();
		poc.left();
	}
}
class pocman{
	void up() {System.out.println("pocman up");}
	void down() {System.out.println("pocman down");}
	void right() {System.out.println("pocman right");}
	void left() {System.out.println("pocman left");}
}
class mario{
	void up() {System.out.println("mario up");}
	void down() {System.out.println("mario down");}
	void right() {System.out.println("mario right");}
	void left() {System.out.println("mario left");}
}
class contra{
	void up() {System.out.println("contra up");}
	void down() {System.out.println("contra down");}
	void right() {System.out.println("contra right");}
	void left() {System.out.println("contra left");}
}