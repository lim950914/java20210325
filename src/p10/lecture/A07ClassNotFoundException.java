package p10.lecture;

public class A07ClassNotFoundException {
	public static void main(String[] args) {
		try {		// 참조값을 던진다	
		Class.forName("p10.lecture.A07ClassNotFoundException");
		} catch (ClassNotFoundException e) { // 참조값을 캐치 받는다
			System.out.println(e.getMessage());
		}
	}
}
