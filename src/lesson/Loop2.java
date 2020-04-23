package lesson;

public class Loop2 {

	public static void main(String[] args) {
	//1.
		for(int i= 0;i<5;i++) {
			System.out.println("こんにちは");
		}
		System.out.println(); //改行
	//2.
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println(); //改行
	//3.
		System.out.println("数字を入力してください");
		int num =new java.util.Scanner(System.in).nextInt();
		for(int i=0;i<=num;i++) {
			System.out.println(i);
		}
		System.out.println(); //改行
	//4.
		for(int i= 1;i<=10;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println(); //改行
	//5.
		for(int i= 5;i>0;i--) {
			System.out.println(i);
		}
		System.out.println();//改行
	//6.
		int sum =0;
		for(int i =1;i<=10;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
