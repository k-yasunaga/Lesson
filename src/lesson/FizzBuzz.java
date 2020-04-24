package lesson;

public class FizzBuzz {

	public static void main(String[] args) {
		for(int i=1;i<=30;i++) {
			System.out.println(getFizzBuzz(i));
		}
	}

	public static String getFizzBuzz(int i) {
		if(i%3==0 && i%5==0) {
			return "FizzBuzz";
				//System.out.println("FizzBuzz");
			}
			else if(i%5==0) {
				return"Buzz";
				//System.out.println("Buzz");
			}
			else if(i%3==0) {
				return "Fizz";
				//System.out.println("Fizz");
			}
			else {
				return i+"";
			//System.out.println(i);
			}
		}
}
