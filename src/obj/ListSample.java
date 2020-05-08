package obj;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("田中");
		names.add("佐藤");
		names.add("鈴木");
		//System.out.println(names.get(1));

		for(String n:names) {
			System.out.println(n);
		}
		List<Sankaku> slist = new ArrayList<Sankaku>();
		slist.add(new Sankaku(10,5));
		slist.add(new Sankaku(8,5));
		slist.add(new Sankaku(10,20));

		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(20);
		ilist.add(30);
		ilist.set(0,50);
		System.out.println(ilist.get(2));
		System.out.println(ilist.size());
		ilist.remove(0);
		for(int i:ilist) {
			System.out.println(i);
		}

		List<String> llist= new LinkedList<>();

		llist.add("abc");
		llist.add("def");
		llist.add("ghi");
		for(String s:llist) {
			System.out.println(s);
		}
		for(Sankaku s: slist) {
			s.menseki();
		}

	}
}
