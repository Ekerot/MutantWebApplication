package com.MutantGenerator.Lists;

import com.MutantGenerator.helpers.DiceResults;

import java.util.ArrayList;
import java.util.Random;

public class ListsNPC {

	private static final String[][] mutation = new String[][] {
			new String[] { "Amfbisk", "Dubbelhjärna", "Eldsprut", "Elektrisk", "Fyrarmad", "Hoppförmåga" },
			new String[] { "Hyperreflex", "Insektoid", "Insektsvingar", "Likätare", "Luxvarelser", "Magnetism" },
			new String[] { "Patokinesi", "Mental dominans", "Monsterkontroll", "Mänsklig planta", "Parasig",
					"Pyrokinesi" },
			new String[] { "Regenerera", "Reptilisk", "Riktningsknöl", "Röt-ätare", "Sonar", "Patokinesi" },
			new String[] { "Sporsäckar", "Sprinter", "Spårsinne", "Syraspott", "Telepati", "Vilddjur" },
			new String[] { "Mänsklig padda (se Zonkompendium 3)", "Kryokinesis (se Zonkompendium 3)", "Hoppförmåga",
					"Röt-ätare", "Mänsklig planta", "Insektsvingar" }, };

	public static String getMutation(ArrayList<DiceResults> roll) {
		return mutation[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];
	}

	private static final String[][] name1 = new String[][] {
			new String[] { "Abar", "Alia", "Alix", "Almenkir", "Amala", "Augustian" },
			new String[] { "Bark", "Benso", "Delta", "Djego", "Doda", "Dunk" },
			new String[] { "Edin", "Ejke", "Elona", "Emalina", "Emdor", "Endel" },
			new String[] { "Ergom", "Erister", "Erjan", "Felin", "Gerber", "Grits" },
			new String[] { "Gros", "Hild", "Ibit", "Iridia", "Johalin", "Jol" },
			new String[] { "Kim", "Juna", "Juperia", "Kalgu", "Kaska", "Katin" },

	};

	private static final String[][] name2 = new String[][] {
			new String[] { "Margit", "Mo", "Marlian", "Landon", "Lard", "Linna" },
			new String[] { "Mak-ron", "Marlianv", "Leodor", "Koli", "Kim", "Markot" },
			new String[] { "Mart", "Max", "Mintel", "Miri", "Mohan", "Mollger" },
			new String[] { "Morris", "Mubba", "Muppe", "Natara", "Nelma", "Nely" },
			new String[] { "Novia", "Oktan", "Olias", "Olli", "Oslo", "Otiak" },
			new String[] { "Plonk", "Piro", "Pontis", "Rasper", "Regis", "Rog" }, };

	private static final String[][] name3 = new String[][] {

			new String[] { "Siniss", "Slabados", "Sofin", "Sticke", "Styx", " Tea" },
			new String[] { "Tegra", "Tida", "Torry", "Vabb", "Vang", " Vilip" },
			new String[] { "Visek", "Vobbe", "Vorhan", "Zanova", "Zeb", " Zeke" },
			new String[] { "Rut", "Rutger", "Sagabet", "Sari", "Savik", " Silia" },
			new String[] { "Zingo", "Junk", "Monja", "Danova", "Skrot", "Jet" },
			new String[] { "Jeff", "Tula", "Hugust", "Nafta", "Denrik", "Danko" }, };

	public static String getName1(ArrayList<DiceResults> roll) {
		return name1[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];
	}

	public static String getName2(ArrayList<DiceResults> roll) {
		return name2[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];
	}

	public static String getName3(ArrayList<DiceResults> roll) {
		return name3[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];
	}

	public static final String[][] description = new String[][] {

			new String[] { "Hukande gång, aplika armar, grymtande tal.", "Kort och kompakt, raspig röst.",
					"Senig, mager och muskulös", "Fet och flämtande, pipig röst.",
					"Groteskt storvuxen, deformerat huvud.", "Sargad och ärrad, hes röst." },
			new String[] { "Spinkig, spretigt hår.", "Klädd i gammal blå overall",
					"Flintskallig, extremt lortig, snäll.", "Brännskadad, har goggles, luktar bränt.",
					"Bär huvudbonad gjord av skrot, mumlar.", "Klädd i rock med prydnader av skrot." },
			new String[] { "Bär alltid gasmask, pratar aldrig.", "Ärrat ansikte, skryter ständigt.",
					"Död blick, hostar av rötskada, luktar sprit.", "Kamouflagekläder, fingrar alltid på sitt vapen",
					"Senig och mager, alltid på sin vakt.",
					"Klädd i lappad plastrock, drar alltid runt på en kundvagn." },
			new String[] { "Flintskallig och småfet, ler alltid", "Onaturligt vacker, blankt hår.",
					"Stirrar på andras grejer, kleptoman.", "Mager och har stora, stirrande ögon.",
					"Dvärgväxt, snackar oavbrutet", "Väsande röst, vill alltid byta något." },
			new String[] { "Iskall blick, ärrat ansikte, snaggat hår.", "Kortväxt, mager, bär hög hatt.",
					"lång och mager, hetsig blick.", "Sval till sinnet och oberörd av allt.",
					"Saknar ben och måste bäras runt.", "Abnormt fet, kan knappt röra sig." },
			new String[] { "Tuggar på en rot, spottar ideligen.", "Svart lugg döljer ett vanställt öga.",
					"Grönaktig, knölig hy, oftast berusad.", "Ansiktet dolt i en huva,tystlåten och hotfyll.",
					"pratar bara med personer han litar på, när han pratar gör han det i tredje person.",
					"Snaggat hår, vresig och tar snabbt till våld." },

	};

	public static String getDescription(ArrayList<DiceResults> roll) {
		return description[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];
	}

	public static final String[][] weapon = new String[][] {

			new String[] { "Cykelkjedja", "Knogjärn", "Huggare", "Tillhygge", "Skrotyxa", "Obeväpnad" },
			new String[] { "Cykelkjedja", "Slagträ", "Slagträ med spikar", "Obeväpnad", "Skrotpistol", "Tillhygge" },
			new String[] { "Huggare", "Pilbåge", "Skrotpistol", "Obeväpnad", "Skrotspjut", "Slunga" },
			new String[] { "Derringer", "Skrotyxa", "Pilbåge", "Skrotyxa", "Obeväpnad", "Skrotspjut" },
			new String[] { "Cykelkjedja", "Knogjärn", "Obeväpnad", "Tillhygge", "Skrotyxa", "Huggare" },
			new String[] { "Knogjärn", "Slagträ", "Slagträ med spikar", "Skrotpistol", "Skrotspjut", "Obeväpnad" },

	};

	public static String getWeapon(ArrayList<DiceResults> roll) {
		return weapon[roll.get(0).getResultat() - 1][roll.get(1).getResultat() - 1];

	}

	private static final String[][] skill = new String[][] {
			new String[] { "Kämpa på", "Ta krafttag", "Slåss", "Smyga", "Fly", "Skjuta" },
			new String[] { "Speja", "Förstå sig på", "Känna zonen", "Genomskåda", "Manipulera", "Vårda" }, };

	public static String getSkill(ArrayList<DiceResults> roll) {
		Random rnd = new Random();

		int temp = rnd.nextInt(2) + 1;

		return skill[temp - 1][roll.get(1).getResultat() - 1] + " " + "FV ";
	}

}
