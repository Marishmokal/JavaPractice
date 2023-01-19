package com.prowings.java.practice;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	Scanner m =new Scanner(System.in);
	int num,reminder,s=0,c;
	System.out.println("enter any number");
	num =m.nextInt();
	c=num;
	while(num>0)
	{
		reminder=num%10;
		s=s*10+reminder;
		num=num/10;
	}
	if(c==s)
	{
		System.out.println("palindrome number");
	}
	else
		System.out.println("not palindrome number");
}
}
