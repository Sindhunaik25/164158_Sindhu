package com.assignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int temp,count=0,a;
		int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			count=count+(a*a*a);
		}
		if(temp==count)
		{
			System.out.println("Armstrong Number");
		
		}
		else
		{
			System.out.println("Not");
		}
	}

}
