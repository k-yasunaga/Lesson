import java.util.ArrayList;

public class rental {
	ArrayList<Item>list = new ArrayList<>();
	void add(Item item) {
		list.add(item);
	}
	
	void show() {
		for(Item item:list) {
			System.out.println(item);
			
		}
	}

	int getGoukei() {
		int sum=0;
		for(Item item:list) {
			sum+=item.getprice();
		}
			return sum ;

	}
}
