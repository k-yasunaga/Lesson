package keisyo;

public class Hero extends character {

	public Hero() {
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
