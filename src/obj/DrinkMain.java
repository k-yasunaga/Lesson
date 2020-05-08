package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {
		Sake s = new Sake("ビール", 500, 5);
		
		
		
		ArrayList<Drink>dlist= new ArrayList<Drink>();
		dlist.add(new Drink("サイダー",500));
		dlist.add(new Drink("コーラ",350));
		dlist.add(new Drink("コーヒー",200));
		dlist.add(new Sake("ウイスキー",200,40));
		int sum=0;
		for(Drink d:dlist) {
			sum+=d.getAmount();
			d.show();
		}
		
		System.out.println(sum + "ml");
		s.show();
	}
		
}
