package obj;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class event {
	String name;
	Date hi  = new Date();
	public event(String name) {
		this.name = name;
	}
	List<sankasya>slist = new ArrayList<>();
	public void add(sankasya s) {
		slist.add(s);
	}

	public void show() {
		System.out.println(this.name);
		SimpleDateFormat f=new SimpleDateFormat("YYYY年MM月dd日");
		String S = f.format(hi);
		System.out.println(S);

		for(sankasya s:slist) {
			System.out.println(s.getName()+s.getAge() + "歳");
		}
	}




}
