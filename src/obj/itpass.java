package obj;

public class itpass extends siken {
	int tensu;
	String name;
	public itpass() {
		super("ITパスポート");
	}

	 void showGoukaku(){
		if(tensu>=70) System.out.println("合格");
		else System.out.println("不合格");
	}

}
