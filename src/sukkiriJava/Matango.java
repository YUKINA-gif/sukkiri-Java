package sukkiriJava;

public class Matango {
	int hp = 50;
	char suffix;
	public Matango (char suffix) {
		this.suffix = suffix;
	}
	public void attack() {
		System.out.println("キノコ" + this.suffix + "の攻撃");
	}
}