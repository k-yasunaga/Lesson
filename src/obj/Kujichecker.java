package obj;

public class Kujichecker {
	int kingaku;

	public void check(Kuji k) {
		if(k.num==123456) {
			k.kekka = "1等";
			kingaku+= 100000;
		}
		else if(k.num%100== 12) {
			k.kekka = "2等";
			kingaku += 1000;
		}
		else {
			k.kekka = "はずれ";
		}
	}
}
