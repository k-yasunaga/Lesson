package obj;

import java.util.ArrayList;

public class SeitoMain {
	
	public static void main(String[] args) {
		
		ArrayList<chugakusei>slist= new ArrayList<chugakusei>();
		 slist.add(new chugakusei("田中",50,70,90,40));
		 slist.add(new chugakusei("山田",60,70,80,100));
		 slist.add(new chugakusei("佐藤",40,80,60,50));
		 int sum=0;
		 for(chugakusei c:slist) {
			 sum+=c.goukei();
		 }
		System.out.println("合計は"+sum+"点");

	}


}
