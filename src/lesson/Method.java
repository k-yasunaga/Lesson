package lesson;

public class Method {

	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		
		System.out.println("終わり");
		keisan(10,20);
		goukei(11);
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
		
		
		
		
		
		}
	public static void jijo(int num) {
		num*=num;
		System.out.println(num);
	}
	
	public static void test(int x) {
		x =20;
	}
	
	public static void hello(String name) {
		System.out.println(name+"さん、こんにちは");
	
	}
	public static void keisan(int num1,int num2) {
		System.out.println(num1+num2);

	}
	public static void goukei(int num) {
	int sum=0;
	for(int i=1;i<=num;i++) {
		sum+=i;
	}
	System.out.println(sum);

	}
	public static void show(String name,int age) {
		System.out.println(name + "さんは" + age + "歳です");
	}
}
