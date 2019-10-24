package com.jh.exam.tv;

//private, default,protected, public,

public class Tv extends Object{

	int channel;
	int volume;

	Tv() {
	}

	Tv(int channel, int volume) {
		this.channel = channel; // this. 나자신 객체주소. 이름이 같을 때 this
		this.volume = volume;
	}

	public void setChannel(int channel) {
		if (channel < 0) {
			this.channel = 1;
		} else if (channel > 300) {
			this.channel = 300;
		} else {
			this.channel = channel;
		}
	}

	public int getChannel() {
		return channel;
	}

	public void setVolume(int volume) {

		this.volume = volume;

		/*
		 * if(volume < 0) { this.volume=0; } else if(volume > 20) { this.volume =20; }
		 * else { this.volume=100; }
		 */
	}

	public int getVolume() {
		return volume;
	}

	void showState() {
		System.out.printf("channel : %d, volume: %d\n ", channel, volume);
	}
	
	void mainShowState() {
		System.out.println("e");
	}
	
	

	/*
	 * void channelUp() { channel++; }
	 * 
	 * void channelDown() { channel--; }
	 * 
	 * void volumeUp() { volume++; }
	 * 
	 * void volumeDown() { volume--; }
	 */

}
