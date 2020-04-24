package lesson;

public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");

		System.out.println("終わり");
		int kotae =keisan(10,20);
		System.out.println(kotae);
		int kotae2 =goukei(100);
		System.out.println(kotae2);
		show("田中",30);
		int x=10;
		test(x);
		System.out.println(x);
		for(int i=10;i<=20;i++) {
		jijo(i);
		}
		String[] names = {"山田","松尾","佐藤"};
		for(String n:names) {
			hello(n);
		}
		boolean b = isGusu(5);
		if(b==true) {
		System.out.println("偶数");
			}
		
		else {
			System.out.println("奇数");
		}
		
		System.out.println(gettimename(8));
		int[] nums = {5,8,9,3};
		printArray(nums);
		String data = "apple,orenge,lemon";
		 String[] fruits = data.split(",");
		 System.out.println(fruits[0]);
		 System.out.println(fruits[1]);
		 System.out.println(fruits[2]);
		 
		System.out.println(getLast(nums));
	 }
	
	
		public static int getLast(int[] array) {
			return array[array.length-1];
		}
	
		public static void printArray(int[]array) {
			for(int num:array) {
				System.out.println(num);
			}
		}
	
		public static String gettimename(int hour) {
			if(0<=hour&&hour<=11) {
				return "午前";
			}
			if(12<=hour&&hour<=24) {
				return "午後";
			}
				return "エラー";
			
		}
	
	
		
		public static boolean isGusu(int num) {
				if(num%2==0) {
					return true;
				}
				else {
					return false;
				}
			
		}
	
	
		public static void jijo(int num) {
			num*=num;
			System.out.println(num);
		}
		public static void jijo(double num) {
			num*=num;
			System.out.println(num);
		}
		public static void test(int x) {
			x =20;
		}
	
		public static void hello(String name) {
			System.out.println(name+"さん、こんにちは");
	
		}
		public static int keisan(int num1,int num2) {
			
			return num1+num2;
		}
		public static int goukei(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum+=i;
		}
			return sum;
	
		}
		public static void show(String name,int age) {
			System.out.println(name + "さんは" + age + "歳です");
		}
}
