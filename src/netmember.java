
public class netmember extends member{
	@Override
	public String toString() {
		return super.toString() + mail ;
	}
	String mail;

	public netmember(String name, String tel, String mail) {
		super(name, tel);
		this.mail = mail;
	}
	public void show() {
		super.show();
		System.out.println(mail);
	}


}
