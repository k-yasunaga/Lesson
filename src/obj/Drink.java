package obj;



public class Drink {
	String name;
	int amount;
	public Drink(String n,int a) {
		this.name= n;
		this.amount =a;
	}
	public void show() {
		System.out.println(name + amount +"ml");

	}
}
