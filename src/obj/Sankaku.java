package obj;

public class Sankaku implements Zukei{
	int teihen;
	int takasa;
	public Sankaku(int t,int T) {
		this.teihen=t;
		this.takasa =T;
	}

	public void menseki() {
		System.out.println(teihen * takasa /2);
	}

	@Override
	public String toString() {
		return "三角 [底辺" + teihen + ", 高さ" + takasa + "]";
	}

}
