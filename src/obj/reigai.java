package obj;

import java.io.FileWriter;
import java.io.IOException;

public class reigai {
	public  static void main(String[] args)throws IOException {
//
//		try (FileWriter fw = new  FileWriter("data.txt");){
//
//			fw.write("hello");
//
//		} catch (IOException e) {
//			// TODO 自動生成された catch ブロック
//			System.out.println("error:"+ e.getMessage());
//		}

		sub();

	}
	public static void sub() throws IOException{

		subsub();

		}
	public static void subsub() throws IOException{
		FileWriter fw = new  FileWriter("data.txt");
	}

}


