package com.MutantGenerator.npc;

import com.MutantGenerator.helpers.DiceRoller;
import com.MutantGenerator.Lists.ListsNPC;

import java.util.Random;

public class NPC {

	private static String name;
	private static String role;
	private static String description;
	private static int strenght;
	private static int coolness;
	private static int sharpness;
	private static int feeling;
	private static String skill1;
	private static String skill2;
	private static String skill3;
	private static String mutation;
	private static String weapon;
	private static int amunition;
	private static int food;
	private static int water;

	public NPC(String name, String role, String description, int strenght, int coolness, int sharpness, int feeling,
			String skill1, String skill2, String skill3, String mutation, String weapon, int amunition, int food,
			int water) {

		NPC.name = name;
		NPC.role = role;
		NPC.description = description;
		NPC.strenght = strenght;
		NPC.coolness = coolness;
		NPC.sharpness = sharpness;
		NPC.feeling = feeling;
		NPC.skill1 = skill1;
		NPC.skill2 = skill2;
		NPC.skill3 = skill3;
		NPC.mutation = mutation;
		NPC.weapon = weapon;
		NPC.amunition = amunition;
		NPC.food = food;
		NPC.water = water;

	}

	public static String generateMutation() {

		String mutation = ListsNPC.getMutation(DiceRoller.roll(2));

		return mutation;

	}

	public static String generateName() {

		Random rand = new Random();

		int index = rand.nextInt(3) + 1;

		if (index == 1) {

			return ListsNPC.getName1(DiceRoller.roll(2));
		}

		else if (index == 2) {
			return ListsNPC.getName2(DiceRoller.roll(2));

		}

		else {

			return ListsNPC.getName3(DiceRoller.roll(2));
		}
	}

	public static String generateDescription() {

		return ListsNPC.getDescription(DiceRoller.roll(2));

	}

	public static int generateAttribute(int in) {

		int max = 0;
		int min = 0;

		if (in == 1) {
			max = 6;
			min = 3;

		}

		if (in == 2) {

			max = 4;
			min = 2;

		}

		if (in == 3) {

			max = 3;
			min = 1;

		}

		return min + (int) (Math.random() * ((max - min) + 1));

	}

	public static String generateWeapon() {

		return ListsNPC.getWeapon(DiceRoller.roll(2));
	}

	@Override
	public String toString() {

		String out = "Namn: " + name + "\n" + "Syssla: " + role + "\n" + "Kännetecken: " + description + "\n"
				+ "Mutation: " + mutation + "\n" + "Vapen: " + weapon + "\n" + strenght + "\n" + coolness + "\n"
				+ sharpness + "\n" + feeling + "\n" + skill1 + skill2 + skill3 + "\n" + amunition + "\n" + food + "\n"
				+ water;

		return out;

	}

	public static String generateSkill() {

		Random rnd = new Random();

		String number = "";

		String tempString = ListsNPC.getSkill(DiceRoller.roll(1));

		int temp = rnd.nextInt(6) + 1;

		if (temp == 6) {

			number = "3";
		}

		else if (temp == 4 || temp == 5) {

			number = "2";

		}

		else
			number = "1";

		return tempString + number;
	}

	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public String getDescription() {
		return description;
	}

	public int getStrenght() {
		return strenght;
	}

	public int getCoolness() {
		return coolness;
	}

	public int getSharpness() {
		return sharpness;
	}

	public int getFeeling() {
		return feeling;
	}

	public static String getSkill1() {
		return skill1;
	}

	public static String getSkill2() {
		return skill2;
	}

	public String getSkill3() {
		return skill3;
	}

	public String getMutation() {
		return mutation;
	}

	public String getWeapon() {
		return weapon;
	}

	public int getAmunition() {
		return amunition;
	}

	public int getFood() {
		return food;
	}

	public int getWater() {
		return water;
	}
}
