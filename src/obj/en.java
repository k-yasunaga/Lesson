package obj;

public class en implements Zukei {

	int hankei;
  	public en(int hankei) {
  		this.hankei = hankei;
  	}

 public void menseki() {
	 System.out.println(hankei*hankei*3.14);
 }
 public void enshu() {
	 System.out.println(2*3.14*hankei);
 }

@Override
public String toString() {
	return "円 [半径" + hankei + "]";
}

public boolean equals(Object o) {
	if(this==o) return true;
	if(o instanceof en) {
		en e = (en)o;
		if(this.hankei== e.hankei) return true;
	}
	return false;
}



}
