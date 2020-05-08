package obj;

public class Seito {
	private String name;
	private int kokugo;
	private int sansu;
	private int syakai;

	public Seito(String name,int kokugo,int sansu,int syakai) {
		 this.name =name;
		 this.kokugo=kokugo;
		 this.sansu=sansu;
		 this.syakai= syakai;
	}

	public void show() {
		System.out.println(name+" 国語"+kokugo+"点 算数"+sansu+"点 社会"+syakai+"点");
	}




	int goukei() {
		int sum =0;
		sum = kokugo +sansu+syakai;
		return sum;
	}
//
//	public double heikin() {
//		double avg =0;
//		 avg = (kokugo +sansu+syakai)/3.0;
//		return avg;
//	}

}
