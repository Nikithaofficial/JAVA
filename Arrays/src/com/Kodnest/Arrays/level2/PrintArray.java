package com.Kodnest.Arrays.level2;

public class PrintArray {
public static void PrintArrayInFowardAndReverse(int a[]) {
	System.out.println("array in forward direction");
	for(int x:a) {
		System.out.print(x+" ");
	}
	System.out.println("array in reverse direction");
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
}
