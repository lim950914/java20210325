package p06.textbook.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}
	// 이 인스턴스를 사용할 유일한 방법 메소드 리턴
	public static Singleton getInstance() {
			return singleton;
	}
}
