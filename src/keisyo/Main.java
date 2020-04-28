package keisyo;

import Sukkiri.matango;

public class Main {

	public static void main(String[] args) {
		superHero sh=new superHero();
		sh.fly();
		sh.land();
		sh.run();
		Hero h=new Hero("");
		h.run();

		matango m1=new matango();
		m1.hp =50;
		m1.suffix ='A';

	}

}
