package lesson;

public class Menseki {

	public static void main(String[] args) {
		//.1
		int r=10;
		enmenseki(r);
		System.out.println();//改行
		//2.
		for(int i=1;i<=5;i++) {
			enmenseki(i);
		}
		System.out.println();//改行
		//3.
		int[] hankeis = {3,8,20};
		for(int R:hankeis) {
			enmenseki(R);
		}
	}

	//メソッド
	public static void enmenseki(int hankei) {
		double seki = hankei*hankei*3.14;
		System.out.println(seki);
	}




}
