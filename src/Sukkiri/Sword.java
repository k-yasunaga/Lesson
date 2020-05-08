package Sukkiri;

public class Sword {
	private String name;
	private int damage;
	
	public Sword(String n,int d) {
		name=n;
		damage =d;
	}
	public String  getname() {
		return this.name;
	}
	public int getdamage() {
		return this.damage;
	}
}
