package keisyo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<character> list = new ArrayList<character>();
		list.add(new superHero());
		list.add(new dancer());
//
	    Hero h1 =new Hero();
		h1.name = "a";
		h1.hp = 100;
		System.out.println(h1);
		Hero h2 =new Hero();
		h2.name = "a";
		h2.hp = 100;
		System.out.println(h2);
		if(h1==h2) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
//
//







//		superHero sh=new superHero();
//		sh.fly();
//		sh.land();
//		sh.run();
//		Hero h=new Hero("");
//		h.run();
//
//		matango m1=new matango();
//		m1.hp =50;
//		m1.suffix ='A';

	}

}
