package lesson;

public class kuku {

	public static void main(String[] args) {
		int a = new java.util.Random().nextInt(9)+1;
		int b = new java.util.Random().nextInt(9)+1;
		int num = a*b;
		System.out.println(a + "×" + b +"は？");
		System.out.println("答えを入力してください");
		int c = new java.util.Scanner(System.in).nextInt();
		 if(c==num) {
			 System.out.println("正解です");
		 }
		 else {
			 System.out.println("間違いです。正解は" + num + "です。");
		 }
	}

}
