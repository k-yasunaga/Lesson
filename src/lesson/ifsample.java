package lesson;

public class ifsample {

	public static void main(String[] args) {
		System.out.println("点数を入力");
		int num = new java.util.Scanner(System.in).nextInt();

		if(num >= 80 ) {
			System.out.println("評価A");
		}
		else if(60 <= num && num <80) {
			System.out.println("評価B");
		}
		else {
			System.out.println("評価C");
		}
	}

}
