package p06.lecture.p5static;

public class MyClass2 {
	// static 은 인스턴트 생성없이 사용가능하다 MyClass2 o1 = new MyClass2(); 얘 없이 사용
	// static PrintStream 흔히 쓰는 sout 도 static 사용한것
	
	// class field = (static field)
	static int i;
	
	// instance field
	int j;
	
	// class method = (static method)
	static void method() {
		System.out.println("method()");
	}
	
	// instance  method
	void method1() {
		System.out.println("method1()");
	}
}
