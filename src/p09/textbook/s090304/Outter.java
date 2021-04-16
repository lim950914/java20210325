package p09.textbook.s090304;

public class Outter {
	String field = "Oueert=field";
	
	void method() {
		System.out.println("Oueert=field");
	}
	
	class Nested {
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
}
