package p05.lecture.enumType;

public class A02EnumType {
	public static void main(String[] args) {
		String s = "VALUE1";

		switch (s) {
		case "VAULE1": // 오타를 잡아주지 않음
			System.out.println("value1 입니다.");
			break;
		case "VALUE2":
			System.out.println("value2 입니다.");
		default:
			System.out.println("둘 다 아닙니다.");
			break;
		}
		
		System.out.println("enum type");
		MyEnum e1 = MyEnum.VALUE1;
		
		switch (e1) {
		case VALUE1:
			System.out.println("value1 입니다.");
			break;
		case VALUE2:
			System.out.println("value2 입니다.");
		default:
			System.out.println("둘 다 아닙니다.");
			break;
		}
	}
}
