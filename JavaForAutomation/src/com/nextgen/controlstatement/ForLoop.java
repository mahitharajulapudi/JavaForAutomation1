package com.nextgen.controlstatement;
/*==============================================================================
 * | Author :  Mahitha Rajulapudi
 * | Project:  NxtGen Automation
 * | Purpose:  This java program is used to explain for loop concept
 * | Date   :  09/20/2021
 * *===========================================================================*/

public class ForLoop  
{
	public static void main(String[] args) 
	{
		// print program to display 10 to 1
		//Syntax: for(initialization;condition;post increment/decrement)

		System.out.println("Numbers in Descending order");
		for(int num=10;num>=1;num--) 
		{
			System.out.println(num);	
		}
	}
}
