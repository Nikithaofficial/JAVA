package com.Kodnest.Arrays.level2;

import java.util.Scanner;

public class PrintArrayByUsingMethod {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the length of array");
	int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the elements of array");
	for(int i=0;i<n;i++) {
		a[i]=s.nextInt();
	}
	PrintArray.PrintArrayInFowardAndReverse(a);
	s.close();
}
}
