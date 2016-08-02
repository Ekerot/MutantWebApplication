package com.MutantGenerator.npc;

import java.util.Random;

public class Zonstrykare extends NPC {

	private static Random rand = new Random();

	private static String name = generateName();
	private static String role = "Zonstrykare";
	private static String description = generateDescription();
	private static int strenght = generateAttribute(3);
	private static int coolness = generateAttribute(1);
	private static int sharpness = generateAttribute(2);
	private static int feeling = generateAttribute(1);
	private static String mutation = generateMutation();
	private static String skill1 = "Leda vägen FV 3";
	private static String skill2 = generateSkill();
	private static String skill3 = generateSkill();
	private static String weapon = generateWeapon();
	private static int amunition = rand.nextInt(6) + 1;
	private static int food = rand.nextInt(6) + 1;
	private static int water = rand.nextInt(12) + 1;

	public Zonstrykare() {

		super(name, role, description, strenght, coolness, sharpness, feeling, skill1, skill2, skill3, mutation, weapon,
				amunition, food, water);

	}

}
