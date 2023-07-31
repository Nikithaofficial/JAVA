package com.Kodnest.Arrays.Level1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the length of array");
int n=s.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array");
for(int i=0;i<n;i++) {
	a[i]=s.nextInt();
}
System.out.println("the elements of array are");
for(int i=0;i<n;i++) {
	System.out.println("the "+i+" element:"+a[i]);
}
s.close();
	}

}
