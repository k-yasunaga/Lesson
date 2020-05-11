package db;

import java.util.ArrayList;

public class dbsample {


	public static void main(String[] args) {
		//insert("なし",90);
		//update(10,"かき",120);
		shouhinDAO dao  = new shouhinDAO();
//		shouhin s = new shouhin(0,"レモン",110);
		//dao.findBysid(3);
		//dao.update(s);
		//dao.insert(s);
		//select();
		//find(3);
		ArrayList<shouhin> list=dao.findAll();
		for(shouhin S:list) {
			System.out.println(S.getSname());
		}
	}




}

