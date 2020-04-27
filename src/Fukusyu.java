
public class Fukusyu {

	public static void main(String[] args) {
		int[] tensus = {80,60,90,50,70};
		int sum =0;
		int count =0;
		for(int T:tensus){
			System.out.println(T);
			sum+=T;	
			if(T>=70) {
				count++;
			}
		}
			System.out.println(sum);
			System.out.println(count);
	}

}
