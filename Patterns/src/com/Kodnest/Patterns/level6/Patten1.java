package com.Kodnest.Patterns.level6;

public class Patten1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
for(int i=1;i<=4;i++) {
	for(int j=3*2;j>=2*i-1;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
	System.out.println();
	
}
for(int i=4;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
	for(int j=3*2;j>=2*i-1;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++) {
		System.out.print("*");
		}
	System.out.println();
	
}


	}

}
