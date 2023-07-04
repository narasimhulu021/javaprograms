package com.jsp.BasicProgramms;

import java.util.Scanner;

public class EligibilityForMarriage {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please Enter Boys Age");
		int boysAge=scn.nextInt();
		System.out.println("Please Enter Girls Age");
		int girlsAge=scn.nextInt();
		if(boysAge>=18&&girlsAge>=18)System.out.println("Both Are Eligible For Marriage");
		else System.out.println("Both are Not Eligible for Marriage");
	}

}
