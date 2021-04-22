package p11.textbook.exercise.ex03;

public class Student {
	private String studentNum;


	public Student(String studrentNum) {
		this.studentNum = studrentNum;
	}
	
	public String getStudrentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.studentNum.equals(((Student) obj).studentNum);
	}
}
