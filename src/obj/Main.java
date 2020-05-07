package obj;

public class Main {

	public static void main(String[] args) {
			Sankaku M = new Sankaku(10,12);

			M.menseki();

			shouhin s =new shouhin("リンゴ",100);

			s.show();
			s.showtax();
			
			book b = new book("それから",500,"夏目漱石");
			
			
			shouhin s1 =new shouhin("みかん",150);

//			en e=new en();
//			e.hankei = 10;
//			e.enshu();
//			e.menseki();

			Uriage u =new Uriage();
			u.kosuu =5;
			u.shouhin = s;
			u.show();

			Uriage u1 =new Uriage();
			u1.kosuu =3;
			u1.shouhin = b;
			u1.show();
			u1.showUriage();

		Densimoney d= new Densimoney();
		d.charge(1000);
		d.buy(500);
		d.change();
		System.out.println(d.kingaku +"円"+d.point +"p");


		Hizike h= new Hizike(4,27);
		
		h.show();
		nitizi n = new nitizi(4,21,12,4);
		n.showjikan();
	}

}
