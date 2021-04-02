package p05.lecture;

public class A06StringEquals {
	// 그림 : 05.StringEquals.png
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String u = "java";
		
		boolean d1 = s.equals(t);
		System.out.println(s == t); // false
		System.out.println(d1); // true
		// d1 이 true 이유 java라는 같은 string을 가지고 있기 떄문
		// equals 는 String 비교
		
		System.out.println(s.equals(s)); // true
		System.out.println(t.equals(u)); // true
	}
}
