package com.MutantGenerator.Lists;

import com.MutantGenerator.helpers.DiceResults;

import java.util.ArrayList;

public class ArtefactList {

	private static final String[][] artifact = new String[][] {
			new String[] { "Antidepressiva tabletter", "Tät skog", "Busklandskap", "Busklandskap", "Träsk", "Träsk" },
			new String[] { "Död skog", "Död skog", "Asköken", "Asköken", "Enorm krater", "Fält av glas" },
			new String[] { "Övervusna ruiner", "Förfallna ruiner", "Öde industrilandskap", "Tät skog", "Busklandskap",
					"Träsk" },
			new String[] { "Död skog", "Asköken", "Övervuxna ruiner", "Söndervittrade ruiner", "Förfallna ruiner",
					"Välbevarade ruiner" },
			new String[] { "Öde industrilandskap", "Övervuxna ruiner", "Övervuxna ruiner", "Söndervittrade ruiner",
					"Söndervittrade ruiner", "Förfallna ruiner" },
			new String[] { "Förfallna ruiner", "Välbevarade ruiner", "Välbevarade ruiner", "Öde industrilandskap",
					"Öde industrilandskap", "Bosättning" },

	};

	public static String getArtifact(ArrayList<DiceResults> roll) {
		return artifact[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];
	}
}
