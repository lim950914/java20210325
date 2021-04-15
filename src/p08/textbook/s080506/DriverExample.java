package p08.textbook.s080506;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.driver(new Bus());
		driver.driver(new Taxi());
	}
}
