package obj;

import java.util.ArrayList;

public class DrinkMain {

	public static void main(String[] args) {
		ArrayList<Drink>dlist= new ArrayList<Drink>();
		dlist.add(new Drink("サイダー",500));
		dlist.add(new Drink("コーラ",350));
		dlist.add(new Drink("コーヒー",200));
		int sum=0;
		for(Drink d:dlist) {
			sum+=d.amount;
			d.show();
		}
		System.out.println(sum + "ml");
	}

}
