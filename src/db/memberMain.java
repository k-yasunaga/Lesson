package db;

import java.util.ArrayList;

public class memberMain {

	public static void main(String[] args) {
		memberDAO mdao=  new memberDAO();
		ArrayList<member>mlist = mdao.findAll();
			for(member m:mlist) {
				System.out.println(m.getMid()+" "+m.getName());
			}
		System.out.println("どの住所を見たいですか？");
		int mid = new java.util.Scanner(System.in).nextInt();

		ArrayList<member>m1list =  mdao.findByMid(mid);
		for(member m1:m1list) {
			System.out.println(m1.getAdr());
		}

	}

}
