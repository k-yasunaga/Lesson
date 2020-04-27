package Sukkiri;

public class Hero {
	String name;
	int hp;
	Sword sword;

	public void attack(matango m) {
		m.hp-=sword.damage;
		System.out.println(name + "の攻撃");
		System.out.println(sword.damage +"ダメージ！！");
		System.out.println("残りHPは" + m.hp  );
	}
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は眠って回復した。");
	}
	public void sit(int sec) {
		this.hp +=sec;
		System.out.println(this.name +sec+ "秒は座った。");
		System.out.println("HPが"+sec+"回復した");
	}
	public void slip() {
		this.hp -=5;
		System.out.println(this.name + "は転んだ");
		System.out.println("５のダメージ");
	}
	public void run() {
		System.out.println(this.name + "は逃げ出した");
		System.out.println("gemeover");
		System.out.println("最終HPは" + this.hp + "でした");
	}

}
