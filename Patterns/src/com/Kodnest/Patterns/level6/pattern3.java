package com.Kodnest.Patterns.level6;

public class pattern3 {
public static void main(String[] args) {
	int n=1;
	int m=9;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=4;j++) {
			if(i%2!=0) {
			System.out.print(n);
			n++;
			if(j<4)
			System.out.print("*");
			}
			else {
				System.out.print(m);
				m++;
				if(j<4)
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
