package p18.lecture;

import java.io.Serializable;

public class Book implements Serializable {
	static final long serialVersionUID = 1234L; // 직렬화 역직렬화 하기 위한 코드
	
	private int id;
	private String name;
}
