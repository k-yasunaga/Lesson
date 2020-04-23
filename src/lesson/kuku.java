package lesson;

public class kuku {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			int num1 = new java.util.Random().nextInt(9)+1;
			int num2 = new java.util.Random().nextInt(9)+1;
			int seki= num1 * num2;
			System.out.println(num1 + "×" + num2 +"は？");
			System.out.println("答えを入力してください");
			
			int kotae = new java.util.Scanner(System.in).nextInt();
			if(kotae==0) {
				break;
			}
			 if(seki== kotae) {
			 System.out.println("正解です");
			}
			else {
			 System.out.println("間違いです。正解は" + seki + "です。");
			}
		}
	}
}
