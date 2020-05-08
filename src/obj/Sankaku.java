package obj;

public class Sankaku implements Zukei{
	private int teihen;
	private int takasa;
	public Sankaku(int t,int T) {
		this.teihen=t;
		this.takasa =T;
	}
	
	public int getteihen() {
		return this.teihen;
	}
	
	public int gettakasa() {
		return this.takasa;
	}
	public void setTeihen(int teihen) {
		this.teihen = teihen;
	}

	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println(teihen * takasa /2);
	}

	@Override
	public String toString() {
		return "三角 [底辺" + teihen + ", 高さ" + takasa + "]";
	}

}
