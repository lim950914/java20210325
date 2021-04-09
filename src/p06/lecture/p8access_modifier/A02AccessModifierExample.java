package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass1;

public class A02AccessModifierExample {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		System.out.println(o1.i);
//		System.out.println(o1.j);  private에서 정의한것은 자기자신만 사용가능하다 그렇기에 에러
//		System.out.println(k); default, package private 는 같은 패키지 내에서만 사용가능 그렇기에 에러
	}
}
