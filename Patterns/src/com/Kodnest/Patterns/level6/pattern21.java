package com.Kodnest.Patterns.level6;

public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				}
			for(int j=1;j<=i;j++) {
				if(j==1||j==i||i==5)
				System.out.print(ch);
				else
					System.out.print(" ");
				ch++;
			}
			ch='A';
			System.out.println();
		}
	}

}
