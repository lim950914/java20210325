package p10.textbook.s100501;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try (TryWithResource fis = new TryWithResource("file.txt")) {
			fis.read();
			Integer.parseInt("abc");
//			throw new Exception();
		} catch (Exception e) {
			System.out.println("에외 처리 코드가 실행되었습니다.");
		}
	}
}
