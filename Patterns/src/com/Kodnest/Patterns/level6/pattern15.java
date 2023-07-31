package com.Kodnest.Patterns.level6;

public class pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=5;i++) {
	for(int j=1;j<=5;j++) {
		if(i+j==6 || i==j) {
			if(j>3) 
				System.out.print("2");
			else
				System.out.print("1");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	}

}
