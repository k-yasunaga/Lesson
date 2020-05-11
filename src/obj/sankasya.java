package obj;

public class sankasya {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public sankasya(String name, int age) throws sankasyaException{
		if(age<0) {
			throw new sankasyaException("年齢が不正です");
		}
		if(name.equals("")) {
			throw new sankasyaException("名前が空です");
		}
		this.name = name;
		this.age = age;
	}



}
