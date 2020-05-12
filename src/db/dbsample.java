package db;

import java.util.ArrayList;

public class dbsample {


	public static void main(String[] args) {
		shouhinDAO dao= new shouhinDAO();
		//全て検索
		ArrayList<shouhin> list=dao.findAll();
		for(shouhin S:list) {
			System.out.println(S.getSname());
		}

		//一つだけ検索
		shouhin s = dao.findBysid(3);
		System.out.println(s.getSname());

		//追加
		shouhin s1 = new shouhin(0,"",100);
		dao.insert(s1);

		//変更
		shouhin s2 = new shouhin(4,"メロン",600);
		dao.update(s2);

		//削除
		//dao.delete(7);
	}




}

