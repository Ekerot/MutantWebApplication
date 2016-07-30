package com.MutantGenerator.npc;

import java.util.Random;

public class MutantMedHund extends NPC {

	private static Random rand = new Random();

	private static String name = NPC.generateName();
	private static String role = "Mutant med hund";
	private static String description = NPC.generateDescription();
	private static int strenght = NPC.generateAttribute(2);
	private static int coolness = NPC.generateAttribute(1);
	private static int sharpness = NPC.generateAttribute(2);
	private static int feeling = NPC.generateAttribute(1);
	private static String mutation = NPC.generateMutation();
	private static String skill1 = "Bussa på FV 3";
	private static String skill2 = NPC.generateSkill();
	private static String skill3 = NPC.generateSkill();
	private static String weapon = NPC.generateWeapon();
	private static int amunition = rand.nextInt(6) + 1;
	private static int food = rand.nextInt(6) + 1;
	private static int water = rand.nextInt(12) + 1;

	public MutantMedHund() {

		super(name, role, description, strenght, coolness, sharpness, feeling, skill1, skill2, skill3, mutation, weapon,
				amunition, food, water);

	}

}