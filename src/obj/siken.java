package obj;

public  abstract class siken {
	String name;

	public siken(String name) {
		this.name = name;
	}
	abstract void showGoukaku();
	
	void show() {
		System.out.println(this.name);
		showGoukaku();
	}
}
