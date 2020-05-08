package Sukkiri;

public class Main {

	public static void main(String[] args) {
		Hero.setRandommoney();
		Sword s = new Sword("炎の剣",10);
		Hero h = new Hero("ミナト");
		Hero h1 = new Hero("abc");
		
		
		System.out.println(Hero.money);
		

		h.setsword(s);
		System.out.println("勇者" + h.getname() + "を生み出した");
		System.out.println("現在の武器は"+h.getsword().getname());
		
		h.sethp(-100);
		System.out.println(h.gethp());
		h.die();
//		Wizard w =new Wizard();
//		w.name = "菅原";
//		w.hp = 50;
//		w.heal(h);
//
//
//
//		matango m1=new matango();
//		m1.hp =50;
//		m1.suffix ='A';
//
//		matango m2=new matango();
//		m2.hp =48;
//		m2.suffix ='B';
//
//		h.attack(m1);
//
//		h.slip();
//		m1.run();
//		m2.run();
//		h.run();


	}

}
