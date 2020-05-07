
public class book extends Item{

	public book(String name, int days) {
		super(name, days);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public int getprice() {
		return days * 50;
	}

}
