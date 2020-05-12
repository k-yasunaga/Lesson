package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class memberDAO {
	static final String URL =  "jdbc:mysql://localhost/club?useSSL=false";
	static final String USER = "java";
	static final String PASS = "pass";

	public ArrayList<member> findAll(){
		ArrayList<member> mlist =new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(URL,USER,PASS);
			String sql = "select * from member";
			PreparedStatement stmt = con.prepareStatement(sql);

			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				int mid = rs.getInt("mid");
				String  name = rs.getString("name");
				String adr = rs.getString("adr");

				member m=new member(mid,name,adr);
				mlist.add(m);
			}
			stmt.close();
			con.close();
		} catch (SQLException e) {

			System.out.println("findAllエラー"+e.getMessage());
		}
		return mlist;

	}

	public ArrayList<member> findByMid(int mid) {
		ArrayList<member> m1list = new ArrayList<>();
		try (Connection con = DriverManager.getConnection(URL,USER,PASS);){

			String sql = "SELECT * FROM member WHERE mid=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, mid);

			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				String  name = rs.getString("name");
				String adr = rs.getString("adr");

				member m1=new member(0,name,adr);
				m1list.add(m1);
			}

			stmt.close();

		} catch (SQLException e) {
			System.out.println("findByMidエラー:" + e.getMessage());
		}
		return m1list;
	}



}
