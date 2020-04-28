package obj;

public class SeitoMain {

	public static void main(String[] args) {
		Seito s= new Seito();
		s.show();
		System.out.println("合計は"+s.goukei()+"点");
		System.out.println("平均は"+s.heikin()+"点");
	}


}
