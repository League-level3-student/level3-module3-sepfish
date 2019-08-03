package _01_AnimalFarm;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int r = random.nextInt(3);
			if (r == 0) {
				farm.add(new Chicken());
			} else if (r == 1) {
				farm.add(new Cow());
			} else if (r == 2) {
				farm.add(new Sheep());
			} else {
				farm.add(new Pig());
			}
		}
		for (int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			JOptionPane.showMessageDialog(null, farm.get(i).getName() + " gave you " + farm.get(i).giveResource());
		}
	}
}
