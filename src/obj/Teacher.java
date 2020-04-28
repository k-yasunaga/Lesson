package obj;

public class Teacher {
	String name;
	int nen;
	int kumi;

	public Teacher(String n,int N,int k) {
		name =n;
		nen = N;
		kumi = k;
	}
	public Teacher(String n) {
		this(n,0,0);
	}
	public void show() {
		if(nen==0||kumi==0) {
			System.out.println(name+"担任なし");
		}
		else {
			System.out.println(name+nen+"年" + kumi+"組");
		}
	}
}
