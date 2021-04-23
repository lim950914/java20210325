package p12.lecture;

public class A03ThreadSleep {
	public static void main(String[] args) {
		
		System.out.println("실행1");
		
		try {
			Thread.sleep(5000); // 실행흐름을 잠깐 멈추게 함 실행1 실행후 5초후 실행2 실행 long타입
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		
		System.out.println("실행2");
	}
}
