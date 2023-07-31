package com.Kodnest.Patterns.Level4;

public class pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1 || i==n ||j==2*i-1) {
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
			
		}
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i==1 || j==1 || j==7||i==7){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
