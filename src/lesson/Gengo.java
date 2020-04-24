package lesson;

public class Gengo {

	public static void main(String[] args) {
		System.out.println("対応する番号を選んでください");
		System.out.println("1:昭和 2:平成 3:令和");
		int Gengou = new java.util.Scanner(System.in).nextInt();

		System.out.println("年を入力");
		int Nen = new java.util.Scanner(System.in).nextInt();

		System.out.println(getGengoName(Gengou) + Nen +"年は西暦"+ getSeireki(Gengou,Nen)+"年です。" );
	}

	//getseireki
		public static int getSeireki(int gengou,int nen) {
			int seireki=0;
			if(gengou==1) {
					seireki =  nen+1925;
					return seireki;
				}
			if(gengou==2) {
					seireki = nen+1988;
					return seireki;
			}
			else {
				seireki = nen+2018;
				return seireki;
			}
		}
	//getgengoname
	public static String getGengoName(int gengou) {
			if(gengou==1) return "昭和";
			if(gengou==2) return "平成";
			else return "令和";

	}
}
