package p10.lecture;

public class A08TryCatch {
	public static void main(String[] args) {

		System.out.println("프로그램 실행");

		try {
			System.out.println("try 블럭 시작");
			
			int[] arr1 = { 5, 6, 7 };
			System.out.println(arr1[3]);
			
			// Exception 이 발생하지않으면 캐치블럭 미실행
			// Exception 이 발생하면 캐치블럭 실행 
			
			System.out.println("try 블럭 종료");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("catch 블럭 시작");
			System.out.println(e.getMessage());
			System.out.println("catch 블럭 종료");
		}

		System.out.println("프로그램 종료");
	}
}
