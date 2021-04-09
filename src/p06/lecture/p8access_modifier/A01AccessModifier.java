package p06.lecture.p8access_modifier;

public class A01AccessModifier {
	// access modifier (접근지정자, 접근제한자)
	// : 정의된 요소가 어디까지 접근 가능한지 명시
	// 필드 생성자 메소드 전부 사용가능하다
	
	//                               전체 상속 패키지 자기자신
	// public     					   o    o     o       o
	// protected					   x    o     o       o
	// (package private, default)      x    x     o       o
	// private                         x    x     x       o
}
