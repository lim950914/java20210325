package p06.lecture.paAnnotation;

public class A04Annotation {
	@MyAnnotation3(999) // 하나의 값만을 명시하면 value 일 경우에만 생략가능
	public void method1() {

	}

	@MyAnnotation3(value = 999)
	public void method2() {

	}
	
	@MyAnnotation3(value = 999, attr1 = 765) // 여러개의 값을 입력하면 꼭 다 입력
	public void method3() {

	}
}
