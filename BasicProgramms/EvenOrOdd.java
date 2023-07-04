package com.jsp.BasicProgramms;

import java.util.Scanner;

public class EvenOrOdd 
{
	public static void main(String[] args) 
	{
		Scanner scn =new Scanner(System.in);
		System.out.println("Please Enter Number");
		int num=scn.nextInt();
		if(num%2==0) System.out.println("Its A Even Number");
		else System.out.println("Its Odd Number");
			
	}
}
