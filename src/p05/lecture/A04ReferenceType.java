package p05.lecture;

public class A04ReferenceType {
	public static void main(String[] args) {
		// 그림 : 03.참조타입.png
		int i = 3;
		int j = i;
		
		String s = new String("java");
		// String 은 new 연산자 생략가능하다
		String t = s;
		
		System.out.println(i == j);
		System.out.println(s == t); // true
		// s객체 t객체 둘다 같은 주소값을 같게되어 true
	}
}
