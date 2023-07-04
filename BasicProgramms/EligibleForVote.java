package com.jsp.BasicProgramms;

import java.util.Scanner;

public class EligibleForVote {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Plese Enter Voter Age");
		int age=scn.nextInt();
		
		if(age>18) System.out.println("Voter is Eligible For Vote");
		else System.out.println("voter is not Eligible for Vote");
	}

}
