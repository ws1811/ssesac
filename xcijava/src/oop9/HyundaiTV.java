package oop9;

public class HyundaiTV implements TV{ // TV가 super Type
	public void powerOn() {
		System.out.println("HyundaiTV : 전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("HyundaiTV : 전원을 끕니다.");
	}
	public void channelUp() {
		System.out.println("HyundaiTV : 채널을 올립니다.");
	}
	public void channelDown() {
		System.out.println("HyundaiTV : 채널을 내립니다.");
	}
	public void soundUp() {
		System.out.println("HyundaiTV : 소리를 키웁니다.");
	}
	public void soundDown() {
		System.out.println("HyundaiTV : 소리를 줄입니다.");
	}
}
