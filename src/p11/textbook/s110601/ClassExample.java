package p11.textbook.s110601;

import p06.textbook.s060602.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName()); // 패키지정보 패키지이름
		System.out.println();
		
		try {
			Class clazz2 = Class.forName("p06.textbook.s060602.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Class clazz3 = p06.textbook.s060602.Car.class;
	}
}
