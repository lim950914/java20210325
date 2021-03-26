package p03.lecture.p1unary;

public class A02IncDec {
	public static void main(String[] args) {
		// 증가 연산자
		// ++ : 변수에 1 더한 값을 다시 변수에 할당
		
		int x = 5;
		x++;
		System.out.println(x);
		
		// 감소 연산자
		// -- : 변수에 1 뺀 값을 다시 변수에 할당
		x--;
		System.out.println(x);
		
		//////////////////
		// 연산자가 앞에 있을 때
		// (어렵게 작성 no 가급적 사용 x)
		// y값은 12 ++ 먼저 실행후 연산됨
		++x;
		System.out.println(x);	
		
		int y = 5 + (++x);
		System.out.println(y);
		
		////////////
		// 연산자가 뒤에 있을 때 
		// (어렵게 작성 no 가급적 사용 x)
		// y 값은 12 y 연산 종료후 ++ 실행됨
		System.out.println(x);
		
		y = 5 + (x++);
		System.out.println(y);
		System.out.println(x);
	}
}
