package obj;

public class shouhin {
	String name;
	int price;
	public void show() {
		System.out.println(name+" "+price +"円");
	}
	public void showtax() {
		System.out.println(price* 0.1 + "円");
	}
}
