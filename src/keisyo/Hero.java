package keisyo;

public class Hero {
	String name="ミナト";
	int hp=100;
	public Hero(String name) {
		this.name =name;
	System.out.println("heroのコンストラクタ");
}


	public void attack(matango m) {
		m.hp-=5;
		System.out.println(name + "の攻撃");
		System.out.println( "5ダメージ");
		System.out.println("残りHPは" + m.hp  );
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した");

	}

}
