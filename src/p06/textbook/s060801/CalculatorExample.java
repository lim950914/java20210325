package p06.textbook.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6); // myCalc.plus(5, 6) 가 11로 바뀐거다
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y); // myCalc.divide(x, y) 가 2.5로 바뀐거다
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}
}
