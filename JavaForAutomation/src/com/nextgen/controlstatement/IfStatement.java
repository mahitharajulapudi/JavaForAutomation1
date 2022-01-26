package com.nextgen.controlstatement;

import java.util.Scanner;

/*==============================================================================
 * | Author :  Mahitha Rajulapudi
 * | Project:  NxtGen Automation
 * | Purpose:  This java program is used to explain if,ele,if else if ladder statements
 * | Date   :  09/20/2021
 * *===========================================================================*/




public class IfStatement {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);	

		System.out.println("Enter the age of a person");

		//If statement	
		int age = scn.nextInt();	
		if(age>=18) {	
			System.out.println(age + "is a major age"); 
		}	

		//else statement

		if(age<=18) {
			System.out.println(age+"is a minor age");
		}	

		//if else if ladder	
		//to validate students marks	
		System.out.println("Enter the marks");	
		int marks = scn.nextInt();	

		if(marks>=80 && marks<=100)  {	
			System.out.println(marks + "is O grade");	
		}	

		else if(marks>75 && marks<79)  {
			System.out.println(marks + "is grade A");

		}


		else if (marks>70 && marks<74) {
			System.out.println(marks + "is grade B");
		}

		else if (marks>60 && marks<69) {
			System.out.println(marks + "is grade C");
		}

		else if (marks>50 && marks<59)  {
			System.out.println(marks + "is grade D"); }

		else if	(marks>45 && marks<49)  {
			System.out.println(marks + "is grade E");	}

		else if (marks>40 && marks<44)  {
			System.out.println(marks + "is grade P");	}

		else if (marks<=39) {	
			System.out.println(marks + "is Fail F");	}








	}








}


