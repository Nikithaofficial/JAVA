package program22;

import java.util.Scanner;

public class Main {
	public static void CheckMultiple (int n,int m) {
		if(n%m==0) {
			System.out.println(n+" is multiple of "+m);
		}
		else {
			System.out.println(n+" is not multiple of "+m);
		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number that need to be checked");
	int n=s.nextInt();
	System.out.println("enter the number ");
	int m=s.nextInt();
	CheckMultiple(n,m);
		}
}
