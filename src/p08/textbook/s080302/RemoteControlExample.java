package p08.textbook.s080302;

import p08.textbook.s080205.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {

			@Override
			public void turnOn() {
				
			}

			@Override
			public void turnOff() {
				
			}

			@Override
			public void setVolume(int volume) {
				
			}
			
		};
		
		// 인터페이스 로 사용하는걸 권장한다
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		rc.setMute(false);
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		
		RemoteControl.ChangeBattery();
	}
}
