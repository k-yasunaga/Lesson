package obj;

public class Uriage {
	int kosuu;
	shouhin shouhin;

	public void show() {
		System.out.println( shouhin.name+"は"+kosuu+ "個売れた");
	}
	public void showUriage() {
		System.out.println( shouhin.name+"は"+shouhin.price*kosuu +"円売れた");
	}
}
