package p07.textbook.s070804;

public abstract class Animal {
	public String kind;
	
	public void berathe( ) {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
}
