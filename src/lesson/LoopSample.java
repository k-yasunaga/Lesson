package lesson;

public class LoopSample {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		int num = new java.util.Scanner(System.in).nextInt();
		for(int i = 1;i <= num;i++) {
			System.out.println(i);
		}








//		for(int i=1;i<=10;i++) {
//			if(i==3) {
//				continue;
//			}
//			System.out.println(i);
//		}


		/*for(int i=1;i<10;i++) {
			for(int j= 1;j<10;j++) {
				System.out.print(i*j);
				System.out.print(" ");
			}
			System.out.println();
		}*/



//		while(true){
//			int num;
//			num = new java.util.Scanner(System.in).nextInt();
//			if(num == 0) break;
//			System.out.println(num * 2);
//
//		}x
//
//		for(int i=1;i<=10;i++) {
//			if(i %2 == 1) {
//			System.out.println(i);
//			}
//		}
	}
}
