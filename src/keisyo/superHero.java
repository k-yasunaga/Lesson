package keisyo;

public class superHero extends Hero {
	boolean flying;

public superHero() {
	super("aa");
	System.out.println("superのコンストラクタ");
}


	public void attack(matango m) {
	 super.attack(m);
	 if(flying) {
		 super.attack(m);
	 }
	}

	public void fly() {
		flying =true;
		System.out.println("飛んだ");
	}
	public void land() {
		flying =false;
		System.out.println("着地した");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");

	}
}
