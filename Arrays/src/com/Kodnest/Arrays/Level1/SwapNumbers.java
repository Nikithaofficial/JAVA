package com.Kodnest.Arrays.Level1;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the two numbers");
int a=s.nextInt();
int b=s.nextInt();
System.out.println(a+" "+b);
int help=a;
a=b;
b=help;
System.out.println(a+" "+b);
	s.close();
	}

}
