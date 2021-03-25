package p02.lecture;

public class A07TypeCharEx1 {
	public static void main(String[] args) {
		String str = "lorem, ipsum, JAVA";

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if ((0x61 <= c && c <= 0x7a) || (0x41 <= c && c < 0x5a)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
