package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int j;
	
	static int a = 30;
	static int b;
	
	// static 필드 설정 블록 위에서 아래로 순서대로실행
	static {
		b =  50;
		System.out.println("static block");
	}
	
	static {
		System.out.println("static block2");
	}
	
	MyClass4() {
		// 인스턴스 필드를 초기화하는 작업
		this.j = 5;
	}
}
