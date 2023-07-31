package com.Kodnest.Patterns.level6;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		for(int i=1;i<=4;i++) {
			
			for(int j=i;j>=1;j--) {
				System.out.print(n);
				n++;
			}
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
