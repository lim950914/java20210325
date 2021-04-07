package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
	
	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}
	
	Computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	// 얘는 위와 같지만 순서가 달라서 가능
	Computer(int memory, String model) { 
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	Computer(String model) {
		this.model = model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	/* 파라미터의 타입, 갯수, 순서에 의해 구분됨
	   위에 랑 갯수와 타입이 같아서 컴파일 에러
	Computer(String cpu) {
		this.model = hp;
		this.memory = 4;
		this.ssd = 128;
	}
	 */	
}
