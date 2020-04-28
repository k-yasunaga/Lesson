package obj;

public class book extends shouhin {
	String auther;
	public book(String name,int price,String auther) {
		super(name,price);
		this.name = name;
		this.price= price;
		this.auther = auther;
	}

	void show() {
			super.show();
			System.out.println(auther);
		}

}
