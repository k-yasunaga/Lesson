package obj;

public class Seito {
	String name="田中";
	int kokugo =80;
	int sansu=70;
	int syakai=50;


	public void show() {
		System.out.println(name+" 国語"+kokugo+"点 算数"+sansu+"点 社会"+syakai+"点");
	}




	public int goukei() {
		int sum =0;
		sum = kokugo +sansu+syakai;
		return sum;
	}

	public double heikin() {
		double avg =0;
		 avg = (kokugo +sansu+syakai)/3.0;
		return avg;
	}

}
