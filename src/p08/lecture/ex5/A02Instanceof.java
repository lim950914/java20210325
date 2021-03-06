package p08.lecture.ex5;

public class A02Instanceof {
	public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
//		instanceof 에서 true 가 나오면 강제변환시 오류 없다
		System.out.println(d1 instanceof KindaDog);
		System.out.println(d1 instanceof Malamute);
		System.out.println(d1 instanceof Pet);
		System.out.println(d1 instanceof SledDog);
		System.out.println(d1 instanceof Wolf);
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SledDog s1 = (SledDog) d1;
		Wolf w1 = (Wolf) d1; // 오류
		
		System.out.println("프로그램종료");
	}
}
