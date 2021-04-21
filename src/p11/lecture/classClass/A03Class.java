package p11.lecture.classClass;

import p11.textbook.s110603.Action;

public class A03Class {
	public static void main(String[] args) {
		Class c1 = A03Class.class;
		
		System.out.println(c1.isInterface()); // 인터페이스 인지 구분하는 코드
		
		Class c2 = Action.class;
		System.out.println(c2.isInterface());
	}
}
