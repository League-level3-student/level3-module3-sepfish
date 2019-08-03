package _01_AnimalFarm;

import java.applet.AudioClip;

import javax.swing.JApplet;

public class Pig extends Animal{

	@Override
	public void makeNoise() {
		playNoise("pig.wav");
	}

	@Override
	public String giveResource() {
		return "pork";
	}

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public String getName() {
		return "Pig";
	}

}
