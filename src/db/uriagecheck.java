package db;

import java.util.ArrayList;



public class uriagecheck {
 public static void main(String[] args) {
	 shouhinDAO dao= new shouhinDAO();
	 ArrayList<shouhin> slist=dao.findAll();
		for(shouhin S:slist) {
			System.out.println(S.getSid()+ " "+ S.getSname());
		}
	  System.out.println("どの売り上げを見たいですか？");
	  int sid= new java.util.Scanner(System.in).nextInt();
	  UriageDAO udao = new UriageDAO();
	  ArrayList<uriage>ulist = udao.findBySid(sid);
	  for(uriage u:ulist) {
		  System.out.println(u.getHi()+" "+u.getKosu()+"個" );
	  }
 	}

 }

