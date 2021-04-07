package p06.textbook.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		
		// System.out.println(myCar.gas);
		myCar.setGas(5);
		// System.out.println(myCar.gas);
		
		boolean gasState = myCar.isLeftGas(); // true 가되어 if 문 실행 왜냐 Car 클래스에서 boolean 타입에 int는 5값을 넣어주었기 때문
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if (myCar.isLeftGas()) { // run 에서 gas가 0이 되었고 Car Class 에서 return 으로 메소드 종료 시켰다
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
