package com.prowings.java.practice;

public class NetSalary {
public static void main(String[] args) {
	int basicSalary,HRA,TA,DA,MA,PF,netSalary;
	basicSalary=35417;
	HRA=37000*45/100;
	TA=37000*25/100;
	DA=37000*30/100;
	MA=37000*5/100;
	PF=37000*25/100;
	netSalary=basicSalary+HRA+TA+DA-MA-PF;
	System.out.println("Net Salary:-"+netSalary);
}
}
