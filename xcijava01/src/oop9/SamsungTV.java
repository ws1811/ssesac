package oop9;

public class SamsungTV implements TV{ // TV가 super Type
//	private Speaker speaker = new OrangeSpeaker(); //의존관계가 생김.
	private Speaker speaker; //의존도를 낮춤
	
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
	public void powerOn() {
		System.out.println("SamsungTV : 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV : 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("SamsungTV : 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("SamsungTV : 채널을 내립니다.");
	}
	public void soundUp() {
		if(speaker == null) {
			System.out.println("SamsungTV : 소리를 키웁니다.");			
		} else {
			speaker.soundUp();
		}
		
	}
	public void soundDown() {
		if(speaker == null) {
			System.out.println("SamsungTV : 소리를 줄입니다.");
		} else {
			speaker.soundDown();
		}
	}
}
