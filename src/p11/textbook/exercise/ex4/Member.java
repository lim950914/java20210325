package p11.textbook.exercise.ex4;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]"; // 소스 제너레이터 투스트링
	}
}
