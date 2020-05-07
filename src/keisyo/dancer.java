package keisyo;

public class dancer extends character {
	public void dance() {
		System.out.println(this.name + "は踊った");
	}
		public void attack(matango m) {
			m.hp-=5;
		}

}
