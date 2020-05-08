package obj;

public class chugakusei extends Seito {
	private int eigo;
	public chugakusei(String name, int kokugo, int sansu, int syaki,int eigo) {
		super(name, kokugo, sansu, syaki);
		this.eigo =eigo;
	}

	int goukei() {
		return super.goukei() +this.eigo;
	}
}
