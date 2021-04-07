package p06.lecture.p4method;

public class MyClass2 {
	int a;
	
	void method1(int b) {
		int c = 99;
		int a = 10000; // 가장 가까운 a값을 출력하게된다
		System.out.println("a:" + a);
		System.out.println("this.a:" + this.a); // 단 디스를 사용하면 위에 a를 나타낸다
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		// 메소드 안 코드블럭 안에 값은 값을 지정해줘야한다
	}
}
