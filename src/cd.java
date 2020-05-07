
public class cd extends Item{

	public cd(String name, int days) {
		super(name, days);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getprice() {
		int sum =300;
		for(int i=2;i<=days;i++) {
			sum+=100;
		}
		return sum;
	}

}
