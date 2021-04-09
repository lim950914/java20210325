package p06.lecture.p9encapsulation;

public class Computer {
	// 필드는 프라이빗으로 놓는 습관
	private String cpu;
	private int ram; // 1보다 작으면 안됨
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getCpu() {
		return this.cpu;
	}
	
	public void setRam(int ram) {
		if (ram < 1) {
			System.out.println("입력할 수 없습니다.");
		} else {
			this.ram = ram;			
		}
	}
	
	public int getRam() {
		return this.ram;
	}
}
