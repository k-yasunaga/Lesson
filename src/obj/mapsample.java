package obj;

import java.util.HashMap;
import java.util.Map;

public class mapsample {

	public static void main(String[] args) {
		Map<String,Integer> prefs = new HashMap<>();
		prefs.put("京都",255);
		prefs.put("東京",1261);
		prefs.put("熊本",181);
		int tokyo = prefs.get("東京");
		System.out.println(tokyo);
		prefs.remove("京都");
		
		prefs.put("熊本", 182);
		int kumamoto = prefs.get("熊本");
		System.out.println(kumamoto);
		
		for(String s:prefs.keySet()) {
			int value = prefs.get(s);
			System.out.println(s + "の人口は"+ value);
		}
	}

}
