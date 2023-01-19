package com.prowings.java.practice;

public class Assign1 {
	 public void disp(char c)
	    {
	         System.out.println(c);
	    }
	    public void disp(char c, int num)  
	    {
	         System.out.println(c + " "+num);
	    }
	}
	class Sample
	{
		 public void disp(char c)
		    {
		         System.out.println(c);
		    }
		    public void disp(char c, int num)  
		    {
		         System.out.println(c + " "+num);
		    }
	   public static void main(String args[])
	   {
	       Assign1 obj = new  Assign1();
	       obj.disp('a');
	       obj.disp('a',10);
	       
	       Sample obj1=new Sample();
	       obj1.disp('a');
	       obj1.disp('a',10);
	   }
	}

