package lesson;

public class Main {

	public static void main(String[] args) {
		double p = 3.14;
		System.out.println("円周率は" + p + "です。");
			int a ;
			int b ;
			a = 20;
			b = a+5;
			System.out.println(a);
			System.out.println(b);
			System.out.println("今日は\"4月\"です");
			System.out.println("\\100");
			System.out.println("C:\\に\"フォルダ\"を作成");
			int num =10;
			int amari  = num % 3;
			System.out.println(amari);
			num +=5;
			System.out.println(num);
			double d = 3;
			int n = (int)3.0;
			String s = "ベスト" + 3;

			int kokugo = 70;
			int sansu = 75;
			System.out.println((double)(kokugo + sansu) / 2);

			int num1 = 3;
			int num2 = 5;
			System.out.println("足し算の結果は" + (num1+num2) + "です。");
			System.out.print("私は");
			System.out.println("安永");

			int m =Math.max(10,20);
			System.out.println(m);
			
			String age = "23";
			int nage = Integer.parseInt(age);
			System.out.println(nage +1);
			
			int r = new java.util.Random().nextInt(90);
			System.out.println(r);
			
			//さいころ
			int saikoro = new java.util.Random().nextInt(6) +1;
			System.out.println(saikoro);
			
			
	}


}
