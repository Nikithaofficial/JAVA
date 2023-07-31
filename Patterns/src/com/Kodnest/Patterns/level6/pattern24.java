package com.Kodnest.Patterns.level6;

public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
for(int i=1;i<=5;i++) {
	for(int j=5;j>i;j--) {
		System.out.print(" ");
	}
	for(int j=1;j<=2*i-1;j++) {
		System.out.print(ch);
		ch++;
	}
	System.out.println();
}
ch='Y';
for(int i=5;i>=1;i--) {
	for(int j=5;j>i;j--) {
		System.out.print(" ");
	}
	for(int j=2*i-1;j>=1;j--) {
		System.out.print(ch);
		ch--;
	}
	System.out.println();
}
	}

}
