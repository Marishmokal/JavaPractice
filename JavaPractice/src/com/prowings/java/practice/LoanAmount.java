package com.prowings.java.practice;

import java.util.Scanner;

public class LoanAmount {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int interestAmt;
	int totalAmt;
	int loanAmt;
	System.out.println("enter loan amount");
	loanAmt=s.nextInt();
	interestAmt=loanAmt*12/100;
	totalAmt=loanAmt+interestAmt;
	System.out.println("INTEREST:-"+interestAmt);
	System.out.println("TOTAL AMOUNT:-"+totalAmt);
}
}
