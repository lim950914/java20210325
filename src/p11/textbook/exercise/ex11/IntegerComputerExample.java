package p11.textbook.exercise.ex11;

public class IntegerComputerExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		
		Integer obj4 = 300;
		Integer obj3 = 300;
		
		System.out.println(obj3 == obj4);
		System.out.println(obj3.equals(obj4));
	}
}
