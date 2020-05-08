package Sukkiri;

public class Wizard {
	String name;
	int hp;
	public void heal(Hero h) {
		h.sethp(h.gethp()+10) ;
		System.out.println(h.getname() + "のHPを10回復した");
	}
}
