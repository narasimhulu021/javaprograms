package com.jsp.BasicProgramms;

import java.util.Scanner;

public class Switchdays {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please Enter Day");
		int day=scn.nextInt();
		switch(day)
		{
		case 1:
			System.out.println("Sunnday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("WendsDay");
			break;
		case 5:
			System.out.println("Thursday");
			break;
			
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
			
		case default :
			System.out.println("Invalid Input");
			
		}
	}

}
