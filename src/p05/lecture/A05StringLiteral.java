package p05.lecture;

public class A05StringLiteral {
	// 그림 : 04.String.png
	public static void main(String[] args) {
		// String new연산자가 생략이 가능하다
		// 다만 생략하면 같은 주소값을 가진 객체가 된다
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		
		System.out.println(s == t); // false
		System.out.println(t == u); // true
	}
}
