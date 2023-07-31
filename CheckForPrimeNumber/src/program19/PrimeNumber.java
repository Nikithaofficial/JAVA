package program19;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean isprime=false;
		if(n>2) {
for(int i=2;i<n;) {
	if(n%i==0) {
		isprime=true;
		break;
	}	
}
if(isprime==true) {
	System.out.println("prime");
}
else {
	System.out.println("not prime");
}
}
		else {
			System.out.println("it is not prime number");
		}
		
	}

}
