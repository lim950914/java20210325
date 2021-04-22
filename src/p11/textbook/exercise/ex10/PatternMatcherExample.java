package p11.textbook.exercise.ex10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]\\w{7,11}";
//		id = "a38k3lo22ll"; 사용가능 id
		boolean isMatch = Pattern.matches(regExp, id);

		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}

	}
}
