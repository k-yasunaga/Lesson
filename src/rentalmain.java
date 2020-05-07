import java.util.ArrayList;

public class rentalmain {

	public static void main(String[] args) {
		ArrayList<Item>list = new ArrayList<>();
		list.add(new cd("RADWIMPS",5));
		list.add(new book("コナン",4));
		list.add(new cd("嵐",6));
		int sum =0;
		for(Item i:list) {
			System.out.println(i.toString());
			sum+=i.getprice();
		}
		System.out.println("合計　"+sum+"円");
	}

}