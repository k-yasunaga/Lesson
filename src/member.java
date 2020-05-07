
public class member {
	String name;
	String tel;

	public member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public void show() {
		System.out.println(name +" "+ tel);
	}
	@Override
	public String toString() {
		return   name  + tel ;
	}




}
