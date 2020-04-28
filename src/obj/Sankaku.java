package obj;

public class Sankaku {
	int teihen;
	int takasa;
	public Sankaku(int t,int T) {
		this.teihen=t;
		this.takasa =T;
	}

	public void menseki() {
		System.out.println(teihen * takasa /2);
	}
}
