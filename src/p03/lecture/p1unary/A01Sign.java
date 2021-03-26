package p03.lecture.p1unary;

public class A01Sign {
	public static void main(String[] args) {
		int x = 100;
		int y = -100;
		int z = -x;
		
		int a = -y;
		
		System.out.println(x); // 100
		System.out.println(y); // -100
		System.out.println(z); // -100
		System.out.println(a); // 100
	}
}
