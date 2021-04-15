package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.bark();
		d1.sit();
		d1.pul();
		
		Pet p1 = d1; // Pet로 타입변환 시에는 sit만 가능
//		p1.bark(); 
		p1.sit();
//		p1.pull();
		
		SledDog s1 = d1;
//		s1.bark();
//		s1.sit();
		s1.pul();
		
		KindaDog k1 = d1;
		k1.bark();
//		k1.sit();
//		k1.pull();
		
		Malamute d2 = (Malamute) k1; // 강제 타입변환
		d2.bark();
		d2.sit();
		d2.pul();
		
		Wolf w1 =  (Wolf) k1; // 오류
		w1.bark();
		
		System.out.println("프로그램 종료");
	}
}
