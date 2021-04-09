package p06.lecture.p9encapsulation;

public class MyClass {
	private String str;
	private int memory;
	private boolean on;
	private String model;
	private int ssd;
	
	public void setStr(String str) {
		this.str = str;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setSsd(int ssd) {
		this.ssd = ssd;
	}
	public String getStr() {
		return str;
	}
	public int getMemory() {
		return memory;
	}
	public boolean isOn() {
		return on;
	}
	public String getModel() {
		return model;
	}
	public int getSsd() {
		return ssd;
	}
}
