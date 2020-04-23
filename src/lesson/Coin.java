package lesson;

public class Coin {

	public static void main(String[] args) {
		int[] coins = {500,100,50,10,5,1};
		int coin ;
		int sum= 0;
		for(int i= 0;i<coins.length;i++) {
		System.out.println( coins[i]+ "円玉は何枚？");
		coin = new java.util.Scanner(System.in).nextInt();
		 sum += coin * coins[i];
		}
		System.out.println(sum + "円");

	}

}
