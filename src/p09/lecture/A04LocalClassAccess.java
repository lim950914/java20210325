package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		int localVar = 3;
//		param과 localVar는 묵시적 final(effectively final)
//		localVar = 4; 값 변화가 불가능하다
//		param = 1;

		class LocalClass {
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
