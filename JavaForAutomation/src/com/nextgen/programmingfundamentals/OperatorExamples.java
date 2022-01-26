package com.nextgen.programmingfundamentals;


/*==============================================================================
 * | Author :  Mahitha Rajulapudi
 * | Project:  NxtGen Automation
 * | Purpose:  This java program is used to explain about types of operators
 * | Date   :  09/19/2021
 * *===========================================================================*/


public class OperatorExamples {

	public static void main(String[] args) {
		//1.Assignment operator	
		int num1 = 20;
		int num2 = 30;
		int num3 = 40;

		//2.Arithmetic operator
		//Addition
		System.out.println(num1 + num2);
		//Subtraction
		System.out.println(num3 - num2);
		//Multiplication
		System.out.println(num2 * num1);
		//Division
		System.out.println(num3 /num1);
		//Remainder
		System.out.println(num3 % num2);

		System.out.println("**************");

		//3.Equality and Relational Operator
		int num4 = 200;
		int num5 = 300;
		int num6 = 200;
		System.out.println(num4 == num6);
		System.out.println(num4 >= num5);
		System.out.println(num4 <= num6);
		System.out.println(num5 != num6);

		System.out.println("*************");
		//4.Conditional operator
		//And Operator &&
		System.out.println(num4==num6 && num5>=6);
		System.out.println(num6>=num5 && num4!=num6);
		//OR Conditonal operator ||
		System.out.println(num4==num6 || num6>=num5);
		System.out.println(num5<=num6 || num5>=num4);
		System.out.println(num4!=num6 || num5<=num6);








	}

}
