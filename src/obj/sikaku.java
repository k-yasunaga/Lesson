package obj;

public class sikaku implements Zukei {
	@Override
	public String toString() {
		return "四角 [幅" + haba + ", 高さ" + takasa + "]";
	}

	private int haba;
	private int takasa;
	
	public int getHaba() {
		return haba;
	}

	public void setHaba(int haba) {
		this.haba = haba;
	}

	public int getTakasa() {
		return takasa;
	}

	public void setTakasa(int takasa) {
		this.takasa = takasa;
	}

	public sikaku(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println(haba*takasa);
	}
}
