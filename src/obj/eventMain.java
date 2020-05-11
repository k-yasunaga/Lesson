package obj;

public class eventMain {

	public static void main(String[] args) {
		event e = new event("春の人狼大会");
		try {
		e.add(new sankasya("田中",-20));
		e.add(new sankasya("山田",40));
		e.add(new sankasya("佐藤",35));
		}catch(sankasyaException E) {
			System.out.println("エラー"+ E.getMessage());
		}
		e.show();
	}

}
