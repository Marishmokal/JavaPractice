package com.prowings.java.practice;

public class CalculateBill {
public static void main(String[] args) {
	int quantity,rate,amount,gst,netAmount; 
	quantity=5;
	rate=1200;
	amount=quantity*rate;
	gst=amount*18/100;
	netAmount=amount+gst;
	System.out.println("bill:-"+amount);
	System.out.println("Gst amount:-"+gst);
	System.out.println("Net amount:-"+netAmount);
	
	
}
}
