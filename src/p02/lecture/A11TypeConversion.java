package p02.lecture;

public class A11TypeConversion {
	public static void main(String[] args) {
		// 정수 : byte, short, int, long
		
		byte byteVar1 = 100;
		short shortVar1 = byteVar1;
		int intVar1 = shortVar1;
		intVar1 = byteVar1;
		
		long longVar1 = intVar1;
		longVar1 = shortVar1;
		longVar1 = byteVar1;
		
		/////////////////////////////////
		int intVar2 = 100;
		short shortVar2 = 100;
//		shortVar2 = intVar2; // not ok
		
		// 강제 형변환 (type casting) casting
		// 작은값의 명칭을 가로안에 기입
		// 원하는 값이 안나올수 있음
		shortVar2 = (short) intVar2;
		System.out.println(shortVar2);
	}
}
