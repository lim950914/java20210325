package p06.lecture.paAnnotation;

import p05.textbook.s050701.Week;

public @interface MyAnnotation2 {
	String value(); // element
	int attr1();
	int[] attr2();
	String[] attr3();
	Week attr4();
	
	int attr5() default 99; // default를 주면 사용할때 꼭 명시하지 않아도 된다
	String attr6() default "java";
}
