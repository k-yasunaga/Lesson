import obj.en;

public class memberMain {

	public static void main(String[] args)  {
		
		 member m = new member("田中","090-7836-1256");
		// m.show(); 
		 System.out.println(m);
		 netmember nm = new netmember("佐藤","090-4433-2346" ,"ex@gmail.com" ); 
		 //nm.show();
		 System.out.println(nm);
		 en e= new en(10);
		 e.menseki();
		 
		 
		 
	}

}
