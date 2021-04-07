package p06.textbook.s060901;

public class Car {
	String model;
	int speed;
	
	Car(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) { // 밑에 포문에서 담긴것을 대입해줌 ex 10
		this.speed = speed;    // 10이 speed 에 담겨서 밑에 코드블럭에 담긴다
	}
	
	void run() {
		for (int i = 10; i <= 50; i+= 10) {
			this.setSpeed(i); // 위에 setSpeed를 담은것
			System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h");
		}
	}
}
