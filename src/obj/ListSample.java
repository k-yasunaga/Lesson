package obj;

import java.util.ArrayList;

public class ListSample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("田中");
		names.add("佐藤");
		names.add("鈴木");
		//System.out.println(names.get(1));

		for(String n:names) {
			System.out.println(n);
		}
		ArrayList<Sankaku> slist = new ArrayList<Sankaku>();
		slist.add(new Sankaku(10,5));
		slist.add(new Sankaku(8,5));
		slist.add(new Sankaku(10,20));

		for(Sankaku s: slist) {
			s.menseki();
		}

	}
}
