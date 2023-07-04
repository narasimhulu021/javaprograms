package com.jsp.BasicProgramms;

import java.util.Scanner;

public class LeapOrNot {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Please Enter Year");
		int year= scn.nextInt();
		
		if(year%400==0 || year%4==0 && year%100!=0 )System.out.println("Its A Leap Year");
		else System.out.println("Its Not A leapYear");
		
	}
}
