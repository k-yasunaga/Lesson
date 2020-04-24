package lesson;

public class Menseki {

	public static void main(String[] args) {
		//.1
		int r=10;
		double m=enmenseki(r);

		System.out.println(m);

		System.out.println();//改行
		//2.
		for(int i=1;i<=5;i++) {
			System.out.println(enmenseki(i));
		}
		System.out.println();//改行
		//3.
		int[] hankeis = {3,8,20};
		for(int R:hankeis) {
			System.out.println(enmenseki(R));
		}
		System.out.println();//改行
		System.out.println(sankakumenseki(10,5));

	}

	//メソッド
	public static double enmenseki(int hankei) {
		double seki = hankei*hankei*3.14;
		return seki;
	}
	//三角面積

	public static int sankakumenseki(int teihen,int takasa) {
		int M=0;
		M= (teihen * takasa) /2;
		return M;
	}



}
