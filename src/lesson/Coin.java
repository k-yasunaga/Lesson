package lesson;

public class Coin {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		int coin ;
		int sum= 0;
		for(int C:coins) {
		System.out.println( C+ "円玉は何枚？");
		coin = new java.util.Scanner(System.in).nextInt();
		 sum += coin * C;
		}
		System.out.println(sum + "円");

	}

}
