package p06.lecture.p8access_modifier.package1;

public class A03AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		System.out.println(o1.i);
//		System.out.println(o1.j); private 은 자기자신만 사용가능
		System.out.println(o1.k); // 이렇게 default, package private 은 같은 패키지 내면 사용가능하다
	}
}
