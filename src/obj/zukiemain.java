package obj;

import java.util.ArrayList;

public class zukiemain {

	public static void main(String[] args) {

		en e1 = new en(10);
		en e2 = new en(10);
			if(e1.equals(e2)) {
				System.out.println("同じ");
			}
			else {
				System.out.println("違う");
			}
			
			
			
			
		ArrayList<Zukei> list = new ArrayList<Zukei>();
		list.add(new sikaku(10,5));
		list.add(new en(10));
		list.add(new Sankaku(5,8));
		for(Zukei z:list) {
			System.out.println(z);
			if(z instanceof en) {
				((en) z).enshu();
			}
		}
//		Zukei s = new sikaku(10, 5);
//		s.menseki();
//		Zukei e= new en(10);
//		e.menseki();
//
//		Zukei san = new Sankaku(5,8);
//		san.menseki();
	}


}
