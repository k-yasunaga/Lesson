package Sukkiri;

public class Hero {
	private String name;
	private int hp;
	private Sword sword;
	static int money;
	public Hero(String n) {
		hp=100;
		name=n;
	}

	public Hero() {
		hp=100;
		name ="ダミー";
	}
	
	public static void setRandommoney() { 
		Hero.money = (int)(Math.random()*1000);
	}

	public String getname() {
		return this.name;
	}

	public int gethp() {
		return this.hp;
	}

	public void sethp(int hp) {
		if(hp<0) System.out.println("エラー");
		else this.hp= hp;
	}
	public Sword getsword() {
		return this.sword;
	}

	public void setname(String name) {
		this.name =name;
	}

	public void setsword(Sword sword) {
		this.sword = sword;
	}

	public void attack(matango m) {
		m.hp-=sword.getdamage();
		System.out.println(name + "の攻撃");
		System.out.println(sword.getdamage() +"ダメージ！！");
		System.out.println("残りHPは" + m.hp  );

		System.out.println("反撃をうけた");
		hp-=2;
		if(hp<0)die();
	}

	public void die() {
		System.out.println(name+"は死亡していまず");
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
