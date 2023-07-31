package com.Kodnest.Arrays.Level1;

import java.util.Scanner;

public class Swap2NumberInArray {

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
		System.out.println("enter two indices for swaping");
		int b=s.nextInt();
		int c=s.nextInt();
		System.out.println("the elements of array before swapping");
		for(int x:a) {
			System.out.print(x+" ");
		}
		System.out.println();
		int help=a[b];
		a[b]=a[c];
		a[c]=help;
		System.out.println("the elements of array after swapping");
		for(int x:a) {
			System.out.print(x+" ");
		}
		
		s.close();
	}
	}


