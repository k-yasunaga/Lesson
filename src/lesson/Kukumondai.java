package lesson;

public class Kukumondai {
	 int num1;
	 int num2;
	public Kukumondai() {
		this.num1 = new java.util.Random().nextInt(9)+1;
		this.num2 = new java.util.Random().nextInt(9)+1;
	}

	public void show() {
		System.out.println(num1+ "×" +num2 + "=" );
	}

	public void check(int kotae) {
		if(kotae==num1*num2) {
			System.out.println("〇");
		}
		else{
			System.out.println("× 答えは"+num1*num2);
		}
	}
}
