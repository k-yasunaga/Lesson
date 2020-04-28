package obj;

public class nitizi extends Hizike {
	int ji;
	int hun;

	public nitizi(int tuki, int hi, int ji, int hun) {
		super(tuki, hi);
		this.ji = ji;
		this.hun = hun;
	}

	public void show() {
		super.show();
		System.out.println( ji+"時" +hun+"分");
		showjikan();
	}

	public void showjikan() {
		System.out.println(tuki + "月"+hi + "分"+ji+"時" +hun+"分");
	}
}
