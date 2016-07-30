package com.MutantGenerator.world;

import java.util.Random;

import com.MutantGenerator.Lists.EnviormentList;
import com.MutantGenerator.helpers.DiceRoller;

public class Enviorment {

	private String enviorment;
	private String rotniva;

	public Enviorment() {

		this.enviorment = this.setEnviorment();
		this.rotniva = this.setRotniva();

	}

	public String setEnviorment() {

		String temp = EnviormentList.getZon(DiceRoller.roll(2));

		if (temp.contains("ruiner")) {

			Random rnd = new Random();
			int roll = rnd.nextInt(2) + 1;

			if (roll == 1) {

				String tempRuin = EnviormentList.getRuinstandard(DiceRoller.roll(2));

				return temp + ": " + tempRuin;

			}

			else {

				String tempRuin = EnviormentList.getRuinIndustri(DiceRoller.roll(2));

				return temp + ": " + tempRuin;

			}
		}

		else {
			return temp;
		}

	}

	public String setRotniva() {
		Random rand = new Random();
		int roll = rand.nextInt(6) + 1;

		if (roll == 1) {

			return "Röt-oas: Rollpersonen tar inga rötpoäng.";
		}

		else if (roll == 6) {

			return "Extra rötdrabbat område: En rötpoäng per timme.";
		}

		else {

			return "Typisk zonsektor: Rollpersonen tar en rötpoäng per dygn.";
		}
	}

	@Override
	public String toString() {
		String out =  enviorment + "\n" + rotniva;

		return out;
	}

}
