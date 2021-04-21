package p05.textbook.s050703;

import p05.textbook.s050701.Week;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name() method
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal() method
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compareTo() method
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2); // compareTo는 뺀 값을 리턴한다 1 - 3 = -2
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() method
			String strDay = "SUNDAY";
			Week weekDay = Week.valueOf(strDay); // valueOf는 스트링으로 포함된 값을 리턴해준다
			if (weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			} else {
				System.out.println("평일 이군요.");
			}
		
		// values() method
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
