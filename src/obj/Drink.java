package obj;



public class Drink {
	private String name;
	private int amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Drink(String n,int a) {
		this.name= n;
		this.amount =a;
	}
	public void show() {
		System.out.println(name + amount +"ml");

	}
}
