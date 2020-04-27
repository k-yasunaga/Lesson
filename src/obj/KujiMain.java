package obj;

public class KujiMain {

	public static void main(String[] args) {
		Kuji K = new Kuji();
		K.num=123456;
		Kuji K1 = new Kuji();
		K1.num=101012;
		Kuji K2 = new Kuji();
		K2.num=654321;

		Kujichecker c = new Kujichecker();
		c.check(K);
		c.check(K1);
		c.check(K2);

		K.show();
		K1.show();
		K2.show();
		System.out.println(c.kingaku +"円");
	}

}
