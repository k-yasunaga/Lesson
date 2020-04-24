package lesson;

public class Hairetu2 {

	public static void main(String[] args) {

		double[] kions = {15.5,20.1,18.3};
			for(double K:kions) {
				show(K);
			}

		String[] names = {"コーラ","コーヒー","水"};
		for(String str:names) {
			System.out.println(str + "は" +str.length() + "文字");
		}
	}
	public static void show(double kion) {
		System.out.println(kion + "度");
	}



}
