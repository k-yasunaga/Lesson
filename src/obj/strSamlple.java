package obj;

public class strSamlple {

	public static void main(String[] args) {
		String s1 = "aaaaloljj";
		String s2 = "Aaa";
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("同じ");
		}else {
			System.out.println("違う");
		}
		if( s1.isEmpty()) {
			System.out.println("空文字");
		}
		if(s1.contains("lol")) {
			System.out.println("含まれている");
		}
		if(s1.startsWith("aaa")) {
			System.out.println("始まる");
		}
		System.out.println(s1.lastIndexOf("ol"));
		System.out.println(s1.substring(4));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println();
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("xyz");
		sb.append("lmn");
		String s = sb.toString();
		System.out.println(s);
		
	}

}
