package p12.lecture;

public class A12Concurrency {
	// 여러 스레드가 값을 공유할때 쓸일이 없도록 코드를 작성해야함
	// 공유하는 값을 쓰지말자 (중요)
	static long shareValue = 0;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable () {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					shareValue++;
				}
			}
		});
		t.start();
		
		for (int i = 0; i < 100_0000; i++) {
			shareValue++;
		}
		
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(shareValue);
	}
}
