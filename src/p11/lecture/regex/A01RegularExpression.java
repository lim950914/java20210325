package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier

	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";

		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);

		regex1 = "java";
		str1 = "java";

		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d";
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d\\d";
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3}"; // {3} 3개 트루
		str1 = "943";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,}"; // {3,} 최소한 3개 이상
		str1 = "98666542210";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-9876-3333";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,5}"; // 3개 이상 5개 이하 트루
		str1 = "233532";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d+"; // \d{1,} + 는 한개이상
		str1 = "1";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d*"; // 숫자가 0개 이상
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d?"; // 0또는 1개
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-9876-3333";
		String str2 = "01098763333";
		String str3 = "010-98763333";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = "\\w";
		str1 = "s";
		str2 = "T";
		str3 = "8";
		String str4 = "_";
		String str5 = "";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "\\w\\d+";
		str1 = "e345678999";
		str2 = "2312321321";
		str3 = "_3987422";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = "(java)"; // 그룹
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));

		regex1 = "(java)+"; // 안에 그룹 반복 개수 상관없음
		str1 = "javajavajava";
		str2 = "javajavajavaj";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));

		regex1 = "(java|python)"; // | 또는
		str1 = "java";
		str2 = "python";
		str3 = "sprring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = "."; // .은 모든문자
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "9";
		str5 = "_";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "\\."; // .만
		str1 = "$";
		str2 = ".";
		str3 = "A";
		str4 = "9";
		str5 = "_";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "[abc]"; // [] 안에 놈들만 허용
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));

		regex1 = "[^abc]"; // ^는 ^얘만 빼고 허용한다
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));

		regex1 = "[a-z]"; // -는 범위 ex a-z는 a부터 z까지 대문자 x
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "[a-zA-Z]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		String str6 = "7";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6));

		regex1 = "[가-힣]+";
		str1 = "김이박ㅋㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\p{IsHangul}+";
		str1 = "김이박최ㅋㅋㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
	}
}
