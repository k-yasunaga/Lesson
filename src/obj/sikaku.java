package obj;

public class sikaku implements Zukei {
	@Override
	public String toString() {
		return "四角 [幅" + haba + ", 高さ" + takasa + "]";
	}

	int haba;
	int takasa;
	
	public sikaku(int haba, int takasa) {
		this.haba = haba;
		this.takasa = takasa;
	}

	public void menseki() {
		System.out.println(haba*takasa);
	}
}
