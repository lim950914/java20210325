package p09.lecture;

public class A06AnonymousClass {
	public static void main(String[] args) {
		int locaVar = 3;
//		locaVar = 4;
		
//		args = new String[] {}; 위에 메인 메소드도 묵시적으로 파이널
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(locaVar);
				System.out.println(args);
			}
		};
	}
}
