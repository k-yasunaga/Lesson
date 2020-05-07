package obj;

public class kihon extends siken {
	int am;
	int pm;
	public kihon( int am, int pm) {
		super("基本情報技術者");
		this.am = am;
		this.pm = pm;
	}
	@Override
	void showGoukaku() {
		if(am>=60&&pm>=60) System.out.println("合格");
		else System.out.println("不合格");

	}


}
