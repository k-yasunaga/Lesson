package obj;

public class Sake extends Drink {
	double alc;

	public Sake(String n, int a, double alc) {
		super(n, a);
		this.alc = alc;
	}

	@Override
	public void show() {
		// TODO 自動生成されたメソッド・スタブ
		super.show();
		System.out.println(alc+"%");
		
	}
	
}
