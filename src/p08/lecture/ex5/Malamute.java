package p08.lecture.ex5;

public class Malamute extends KindaDog implements Pet, SledDog {
	@Override
	public void bark() {
		System.out.println("왈왈~~");
	}
	
	@Override
	public void sit() {
		System.out.println("앉습니다.");
	}
	
	@Override
	public void pul() {
		System.out.println("설매를 끕니다.");
	}
}
