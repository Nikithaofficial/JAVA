package com.Kodnest.Arrays.Level1;

import java.util.Scanner;

public class PrintPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter the length");
int a[]=new int[s.nextInt()];
System.out.println("enter the elements");
for(int i=0;i<a.length;i++) {
	a[i]=s.nextInt();
}
/*for(int i=0;i<a.length;i++) {
	if(a[i]>=0) {
		System.out.println(a[i]);
	}
}
*/
for(int x : a) {
	if(x>=0) {
		System.out.println(x);
	}
}
s.close();
	}

}
