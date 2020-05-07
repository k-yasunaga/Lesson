public class rentalmain {

	public static void main(String[] args) {
		rental r =new rental();
		r.add(new cd("RADWIMPS",5));
		r.add(new book("コナン",4));
		r.add(new cd("嵐",6));
		r.show();
		System.out.println("合計"+r.getGoukei() +"円");

//		ArrayList<Item>list = new ArrayList<>();
//		list.add(new cd("RADWIMPS",5));
//		list.add(new book("コナン",4));
//		list.add(new cd("嵐",6));
//		int sum =0;
//		for(Item i:list) {
//			System.out.println(i);
//			sum+=i.getprice();
//		}
//		System.out.println("合計　"+sum+"円");
	}

}