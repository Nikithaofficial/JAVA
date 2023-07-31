package com.Kodnest.Patterns.level6;

public class pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
for(int i=1;i<=2;i++) {
	for(int j=2;j>i;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i*2+1;j++) {
		System.out.print(n);
		n++;
	}
	for(int j=3;j>=2*i-1;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=i*2+1;j++) {
		System.out.print(n);
		n++;
		if(n==10)
			n=1;
	}
	System.out.println();
	n=1;}
n=1;
for(int i=6;i>=1;i--) {
	for(int j=i;j<6;j++) {
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++) {
		System.out.print(n);
		n++;
		if(n==10)
			n=1;
	}
	for(int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	System.out.println();
	n=1;
}
	}
}
