package obj;

public class Densimoney {
	private int kingaku=0;
	private int point=0;
	
	
	public int getKingaku() {
		return kingaku;
	}

	public int getPoint() {
		return point;
	}

	public void charge(int m) {
		kingaku+=m;
	}

	public void buy(int m) {
		if(kingaku<m) {
			System.out.println("エラー");
		}
		else{
			kingaku-=m;
			point+=m*0.05;
		}
	}
	public void change() {
		kingaku+=point;
		point=0;
	}
}
