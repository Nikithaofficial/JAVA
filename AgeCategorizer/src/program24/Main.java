package program24;

import java.util.Scanner;

public class Main {
	public static void AgeCategorizer(int n) {
		if(n>0 && n<=12) {
			System.out.println("chlid");
		}
		else if(n>12 && n<=19) {
			System.out.println("teen");
		}
		else if(n>19 && n<60) {
			System.out.println("adult");
		}
		else {
			System.out.println("senior");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n=s.nextInt();
AgeCategorizer(n);
	}

}
