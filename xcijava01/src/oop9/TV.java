package oop9;

public interface TV {
	public void powerOff();
	public void channelUp() ;
	public void powerOn();
	public void channelDown();
	public void soundUp();
	public void soundDown();
	public default void setSpeaker(Speaker orangeSpeaker) {}
}
