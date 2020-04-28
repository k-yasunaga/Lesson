package lesson;

import java.util.ArrayList;

public class Kukumain {
	Kukumondai K= new Kukumondai();
	public static void main(String[] args) {
		ArrayList<Kukumondai> klist = new ArrayList<Kukumondai>();
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		for(Kukumondai k:klist) {
			k.show();
			int num = new java.util.Scanner(System.in).nextInt();
			k.check(num);
		}
	}

}
