package lesson;

public class ifsample {

	public static void main(String[] args) {
		System.out.println("月を入力");
		int month = new java.util.Scanner(System.in).nextInt();
		switch (month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31日");
				break;
			case 2:
				System.out.println("29日");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30日");
				break;
			default :
				System.out.println("エラー");
				break;
				
				/*System.out.println("コーラ");
				break;
			case 2:
			case 4:
				System.out.println("コーヒー");
				break;
			case 3:
				System.out.println("水");
				break;
			default:
				System.out.println("エラー");
				break;*/
		}
		/*if(num == 1 ) {
			System.out.println("コーラ");
		}
		else if(num ==2 ) {
			System.out.println("コーヒー");
		}
		else if(num == 3){
			System.out.println("水");

		}
		else {
			System.out.println("エラー");
		}*/
	}

}
