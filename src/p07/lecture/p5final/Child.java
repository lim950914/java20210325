package p07.lecture.p5final;

public final class Child extends Parent {
	@Override
	public void method1() {
		System.out.println("method1 child");
	}
	
	/*
	public void method2() {
		System.out.println("method2 child");
		Parent 의 method2 메소드에 final 키워드가 있어 상속불가
	}
	*/
}
