package obj;

public class Main {

	public static void main(String[] args) {
			Sankaku M = new Sankaku();

			M.takasa = 10;
			M.teihen = 20;
			M.menseki();

			shouhin s =new shouhin();
			s.name = "リンゴ";
			s.price = 100;
			s.show();
			s.showtax();
			
			shouhin s1 =new shouhin();
			s1.name = "みかん";
			s1.price = 150;
			
			en e=new en();
			e.hankei = 10;
			e.enshu();
			e.menseki();
			
			Uriage u =new Uriage();
			u.kosuu =5;
			u.shouhin = s;
			u.show();
			
			Uriage u1 =new Uriage();
			u1.kosuu =3;
			u1.shouhin = s1;
			u1.showUriage();
			
		Densimoney d= new Densimoney();
		d.charge(1000);
		d.buy(500);
		d.change();
		System.out.println(d.kingaku +"円"+d.point +"p");


		Hizike h= new Hizike();
		h.day = 27;
		h.month= 4;
		h.show();
		Hizike h1= new Hizike();
		h1.day = 7;
		h1.month= 5;
		h1.show();
	}

}
