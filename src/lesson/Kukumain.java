package lesson;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Kukumain {

	public static void main(String[] args) {
		ArrayList<Kukumondai> klist = new ArrayList<Kukumondai>();
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		klist.add(new Kukumondai());
		
		for(Kukumondai k:klist) {
			k.show();
			try {
			int num = new java.util.Scanner(System.in).nextInt();
			k.check(num);
			}
			catch(InputMismatchException e) {
				System.out.println("error");
				}
			}
			
		}
	}

