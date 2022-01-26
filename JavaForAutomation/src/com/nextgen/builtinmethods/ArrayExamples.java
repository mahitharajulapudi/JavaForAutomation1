package com.nextgen.builtinmethods;
/*==============================================================================
 * | Author :  Mahitha Rajulapudi
 * | Project:  NxtGen Automation
 * | Purpose:  This program is to learn about java arrays(Examples).
 * | Date   :  10/09/2021
 * *===========================================================================*/
import java.util.Arrays;

public class ArrayExamples {

	public static void main(String[] args) {

		// 1: Create Array
		// Syntax : dataType arrName[]

		int arrNum[];


		// 2 : Define Arrays - Allocate memory
		// Syntax : arrName = new data type[size];
		arrNum = new int[4];


		// 3 : Assign the values
		arrNum[0] = 400;
		arrNum[1] = 500;		  
		arrNum[2] = 600;
		arrNum[3] = 700;

		// Display (Accessing)	
		System.out.println(arrNum[3]);

		System.out.println("*************Numbers******************");

		// Alternative way
		int arrNum2[] = {40,50, 60,70,80};
		System.out.println(arrNum2[4]);


		// Print all the arrays
		for(int iArr : arrNum2) {
			System.out.println(iArr);
		}

		// Print as list using tostring
		String arrNumList = Arrays.toString(arrNum2);
		System.out.println(arrNumList);

		System.out.println("**************Strings****************");	

		String arrName[] = {"Mahitha","Sowjanya","Nishitha","Radhika","Priya"} ;
		System.out.println(arrName[3]);


		// Display
		for(String iArr : arrName ) {
			System.out.println(iArr);
		}

		String arrNumList2 = Arrays.toString(arrName);	
		System.out.println(arrNumList2);	

		System.out.println("*************Methods***************");	

		// Present or not
		boolean Word = Arrays.asList(arrName).contains("Mahitha");
		System.out.println(Word);

		// String method
		// Split Method
		String msg = "Welcome to NxtGen AI Academy. AI is called Artificical Intellience";
		String arrWords[] = msg.split("AI");
		for(String iArr : arrWords ) {

			System.out.println(iArr);
		}

		// To find total occurance of word(AI's)
		System.out.println(arrWords.length-1);









	}

}
