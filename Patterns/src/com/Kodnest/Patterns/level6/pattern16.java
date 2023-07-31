package com.Kodnest.Patterns.level6;

public class pattern16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		
for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(i+j==6||j==i) {
		System.out.print((char)(ch+j-1));
		
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}
}
