package db;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class uriageMain {

	public static void main(String[] args) {
		UriageDAO dao= new UriageDAO();
		//すべて検索
		ArrayList<uriage>ulist = dao.findAll();
			for(uriage u:ulist) {
				System.out.println(u.getKosu());
			}
		//一つだけ検索
			uriage u1 = dao.findByUid(1);
			System.out.println(u1.getHi());
		//sidで検索
			ArrayList<uriage>u1list = dao.findBySid(1);
			for(uriage u2:u1list) {
				System.out.println(u2.getHi());
			}
		//追加
			uriage u3 = new uriage(0,1,145,null);
			dao.insert(u3);

		//変更
			Calendar c =Calendar.getInstance();
			c.set(2020,4-1,1);
			Date hi= new Date(c.getTimeInMillis());
			uriage u4 = new uriage(5,3,1,hi);
			dao.update(u4);
		//削除
			dao.delete(7);


	}

}
