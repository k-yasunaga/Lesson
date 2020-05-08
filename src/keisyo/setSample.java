package keisyo;

import java.util.HashSet;
import java.util.Set;

public class setSample {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("red");
		colors.add("blue");
		colors.add("green");
		colors.add("red");
		for(String s:colors) {
			System.out.println(s);
		}
		

	}

}
