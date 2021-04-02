package p05.lecture;

public class A08callbyValue {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		method1(i); // i 가 밑에 메소드에 대입되어 출력
		method1(j); // j 가 밑에 메소드에 i 대신 대입되어 출력
		
		String s = "java";
		String u = new String("java");
		System.out.println(System.identityHashCode(s));
	    method2(s);
	    System.out.println(System.identityHashCode(u));
		method2(u);
	}
	
	public static void method1(int a) {
		System.out.println(a);
	}
	
	public static void method2(String s) {
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
	
}

