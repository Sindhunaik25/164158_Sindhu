package com.assignment;

public class Armstrong2 {

	public static void main(String[] args) {
		for(int limit=100;limit<1000;limit++){
		int count=0,a=0;
		int n;
		n=limit;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			count=count+(a*a*a);
		}
		if(limit==count)
		{
			System.out.println(limit+" is Armstrong Number");
		
		}
	
	}
	}
}

