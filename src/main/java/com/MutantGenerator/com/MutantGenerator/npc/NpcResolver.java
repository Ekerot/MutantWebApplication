package com.MutantGenerator.npc;

public class NpcResolver {

	public static NPC resolve(String roleDesc) {

		if (roleDesc == null)
			throw new IllegalArgumentException("Parameter roleDesc can´t be null.");

		switch (roleDesc.toLowerCase()) {

		case "krossare":
			return new Krossare();

		case "fixare":
			return new Fixare();
			
		case "slav":
			return new Slav();
			
		case "mutantmedhund":
			return new MutantMedHund();

		case "boss":
			return new Boss();
			
		case "kronikor":
			return new Kronikor();
			
		case "skrotskalle":
			return new Skrotskalle();
			
		case "zonstrykare":
			return new Zonstrykare();
		}

		return null;

	}

}
