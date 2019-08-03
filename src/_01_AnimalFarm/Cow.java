package _01_AnimalFarm;

import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;

public class Cow extends Animal{

	@Override
	public void makeNoise() {
		playNoise("cow.wav");
	}

	@Override
	public String giveResource() {
		Random rand = new Random();
		int r = rand.nextInt(1);
		if (r == 0) {
			return "milk";
		} else {
			return "beef";
		}
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
		return "Cow";
	}

}
