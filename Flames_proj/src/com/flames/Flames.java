package com.flames;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.TreeMap;
//import com.flames.*;
import com.internal.FirstClass;

public class Flames {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String decide;
		do{
			doFlames();			
			System.out.print("\nDo you want to try with other names? (yes): ");
			decide = input.nextLine();
			System.out.println();
		}while(decide.toLowerCase().equals("yes"));
		System.out.println("Thank You!!!");
	}
	
	public static void doFlames(){
	
		FirstClass common = new FirstClass();
		
		/*
		 * Please enter the
		 * BOY and GIRL Name
		 * below
		 * 
		 */

		System.out.print("Enter the boy name: ");
		
		Scanner input = new Scanner(System.in);
		
		String boy = input.nextLine(); /////BOY Name
		
		//System.out.println();
		
		System.out.print("Enter the girl name: ");
		
		String girl = input.nextLine(); ///// Girl Name		
				
		
		String flames = "flames";
		String[] flamesArray;
		
		String boyTemp = "!"+boy.replaceAll(" ", "").toLowerCase()+"!";
		String girlTemp = "#"+girl.replaceAll(" ", "").toLowerCase()+"#";		
		String[] boyArray = boyTemp.split("");
		//String[] girlArray = girlTemp.split("");		
		int boyCharCount = boy.length();
		int girlCharCount = girl.length();
		int count = 0;
		int value = 0;
		int check = 0;
		int flamesCount = 0;
		
		for(int i=0; i<boyArray.length; i++){
			//System.out.println(boyArray[i]);			
			if((common.getCharCount(girlTemp, boyArray[i]))>0){
				if((common.getCharCount(boyTemp, boyArray[i])) <= (common.getCharCount(girlTemp, boyArray[i]))){
					value = common.getCharCount(boyTemp, boyArray[i]);
				}
				else{
					value = common.getCharCount(girlTemp, boyArray[i]);
				}
				count = count + value;
				value = 0;
				girlTemp = girlTemp.replace(boyArray[i], "~");
				
			}
		}		
		count = (boyCharCount - count) + (girlCharCount - count);
		//System.out.println("Count is: " + count);		
		int i =0;
		flamesArray = flames.split("");
		if(count>0){
			while(flamesCount<5){				
				for(i=0; i<6; i++){
					check++;
					if((flamesArray[i] == "~")){
						check--;
					}
					if(check==count){
							flamesArray[i] = "~";
							check=0;
					}
					flamesCount = common.getCharCount(Arrays.toString(flamesArray),"~");
					if(flamesCount == 5){
						break;
					}
				}
							
			}
			//System.out.println(Arrays.toString(flamesArray));	
			System.out.println(boy.toUpperCase() +" and " + girl.toUpperCase() + " are meant to be " + common.getFlames(Arrays.toString(flamesArray)) + "!!!");
		}
		else {
			System.out.println("<O`_o`> .... you guys are meant to be together always!!!");
		}
	}
	
	

}
