package com.jh.exam.tv;

public class SamSungTv extends Tv {

	void channelUp() {

		setChannel(channel + 5);

		/*
		 * int ch = getChannel();
		 * 
		 * ch+=5; setChannel(ch);
		 */
	}

	void VolumeUp() {

		setVolume(volume + 5);

	}
	
	@Override
	
	public String toString()
	{
		return String.format("%s tv의 채널 : %d, 볼륨: %d", "삼성", channel,volume);
	}


}
