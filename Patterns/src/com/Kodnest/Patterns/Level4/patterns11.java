package com.Kodnest.Patterns.Level4;

public class patterns11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=3;i++) {
	for(int j=1;j<=3;j++) {
		if(i==1 || j==1 || j==3||i==3) {
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
