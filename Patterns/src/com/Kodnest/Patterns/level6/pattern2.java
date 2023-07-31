package com.Kodnest.Patterns.level6;

public class pattern2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
for(int i=1;i<=4;i++) {
	for(int j=i;j>=1;j--) {
		System.out.print(n);
		n++;
	}
	for(int j=4;j<i;j--) {
		System.out.print(" ");
	}
	System.out.println();
}
n=11;
for(int i=4;i>=1;i--) {
	for(int j=1;j<=i;j++) {
		System.out.print(n);
		n--;
	}
	for(int j=4;j<i;j--) {
		System.out.print(" ");
	}
	System.out.println();
}

}
}
