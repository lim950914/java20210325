package p06.lecture.p6final;

public class A01Final {
	// final 키워드 로 사용하는 것은 대문자로 작성하는 관습 값이 변하지 않는다를 강조하기 위해
	// static final 이나 final static 이나 똑같다
	static final int f;
//	final static int f = 55;
	// final 키워드는 위나 아래 처럼 꼭 값을 지정해줘야함
	static {
		f = 55;
	}
	
	final static double PI = 3.1415;
	
	int a;
	final int b = 9;
	
	// final 키워드는 위나 아래 처럼 꼭 값을 지정해줘야함
	A01Final() {
//		this.b = 9;
	}
	
	
	public static void main(String[] args) {
		// final 변수(지역변수 int j 를 말한다), 파라미터, 필드)
		// 값을 한 번만 할당 받을 수 있음
		
		final int i;
		int j;
		j = 3;
		j = 5;
		
		i = 9;
//		i = 10; i 에 final 있어 값을 받을 수 없다
	}
	
	static void method1(final int i) {
		System.out.println(i);
//		i = 3; 이 경우도 불가능
	}
}
