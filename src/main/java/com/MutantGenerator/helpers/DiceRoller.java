package com.MutantGenerator.helpers;

import java.util.ArrayList;
import java.util.Random;


public class DiceRoller {
	
	public static ArrayList<DiceResults> results = new ArrayList<DiceResults>();

    public static ArrayList<DiceResults> roll (int amountDices){
        
        Random rnd = new Random();
        for (int i=0; i<amountDices; i++){
            int roll = rnd.nextInt(6)+1;
            results.add(new DiceResults(roll));
        }
        return results;
    }
    
    @Override
	public String toString(){
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for(DiceResults d : results){
    		
    		int tmp = d.getResultat();
    		sb.append(tmp + "\n");
    		
    	}
		return sb.toString();
    	
    }

}
