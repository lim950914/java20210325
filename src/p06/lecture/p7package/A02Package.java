package p06.lecture.p7package;

import java.util.Scanner;

import p06.lecture.p7package.package1.MyClass1;
import p06.lecture.p7package.package2.*; // * 은 패키지 안의 모든 클래스를 의미한다


public class A02Package {
	// 다른 패키지를 이용하려면 임포트 하면 된다
	public static void main(String[] args) {
//		p06.lecture.p7package.package1.MyClass1 o1 = new p06.lecture.p7package.package1.MyClass1();
		
		
		MyClass1 o1 = new MyClass1();
		
		MyClass2 o2 = new MyClass2();
		
		MyClass3 o3 = new MyClass3();
		
		Scanner scanner = new Scanner(System.in);
	}
}
