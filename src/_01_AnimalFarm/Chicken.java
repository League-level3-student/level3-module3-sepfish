package _01_AnimalFarm;

import java.applet.AudioClip;
import java.util.Random;

import javax.swing.JApplet;

public class Chicken extends Animal{

	@Override
	public void makeNoise() {
		playNoise("chicken.wav");
	}

	@Override
	public String giveResource() {
		Random rand = new Random();
		int r = rand.nextInt(1);
		if (r == 0) {
			return "eggs";
		} else {
			return "chicken";
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
		return "Chicken";
	}


}
