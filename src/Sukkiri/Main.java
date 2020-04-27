package Sukkiri;

public class Main {

	public static void main(String[] args) {
		Sword s = new Sword();
		s.name ="炎の剣";
		s.damage = 10;

		Hero h = new Hero();
		h.name ="ミナト";
		h.hp = 100;
		h.sword = s;
		System.out.println("勇者" + h.name + "を生み出した");
		System.out.println("現在の武器は"+h.sword.name);

		Wizard w =new Wizard();
		w.name = "菅原";
		w.hp = 50;
		w.heal(h);



		matango m1=new matango();
		m1.hp =50;
		m1.suffix ='A';

		matango m2=new matango();
		m2.hp =48;
		m2.suffix ='B';

		h.attack(m1);

		h.slip();
		m1.run();
		m2.run();
		h.run();


	}

}
