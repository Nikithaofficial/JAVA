package com.Kodnest.Patterns.level3;

public class pattern4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*for(int i=1;i<=n;i++) {
			if(i<=5) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			}
		    if(i>=5) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			}
			System.out.println();
		}*/
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
