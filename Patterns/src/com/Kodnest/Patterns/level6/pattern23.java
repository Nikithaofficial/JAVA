package com.Kodnest.Patterns.level6;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='A';
for(int j=1;j<=5;j++) {
	for(int i=1;i<=j;i++) {
		System.out.print(ch);
		ch++;
	}
	ch='A';
	System.out.println();
}
	
	for(int j=5;j>=1;j--) {
		for(int i=1;i<=j;i++) {
			System.out.print(ch);
			ch++;
		}
		ch='A';
		System.out.println();
	}
		}

}
