package com.internal;

import java.util.TreeMap;

public class FirstClass {
	
	/**
	 * 
	 * @param word
	 * @param letter
	 * @return integer
	 */

	public static int getCharCount(String word, String letter){
		int count = 0;
		String[] splitTemp;
		
		splitTemp = word.split(letter);
		count = splitTemp.length -1;
		
		return count;	
	}
	
	public static String getFlames(String fWord){
		
		String t = "WRONG";
		TreeMap<String, String> flamesMap = new TreeMap<String, String>();
		
		flamesMap.put("[f, ~, ~, ~, ~, ~]", "FRIENDS");
		flamesMap.put("[~, l, ~, ~, ~, ~]", "LOVERS");
		flamesMap.put("[~, ~, a, ~, ~, ~]", "AFFECTIONATE");
		flamesMap.put("[~, ~, ~, m, ~, ~]", "MARRIED");
		flamesMap.put("[~, ~, ~, ~, e, ~]", "ENEMIES");
		flamesMap.put("[~, ~, ~, ~, ~, s]", "SISTER and BROTHER");
		
		t = flamesMap.get(fWord);
		return t;
	}

}
