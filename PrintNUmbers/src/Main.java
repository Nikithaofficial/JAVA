import java.util.Scanner;

public class Main {
	public static void DivisibleBy2(int n) {
		System.out.println("numbers divisble by 2");
		for (int i=1;i<=n;i++) {
			if(i%2==0) {
				
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void DivisibleBy3(int n) {
		System.out.println("numbers divisble by 3");
		for (int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void DivisibleBy5(int n) {
		System.out.println("numbers divisble by 5");
		for (int i=1;i<=n;i++) {
			if(i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void DivisibleBy2and5(int n) {
		System.out.println("numbers divisble by 2&5");
		for (int i=1;i<=n;i++) {
			if(i%5==0 && i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void DivisibleBy3and5(int n) {
		System.out.println("numbers divisble by 3&5");
		for (int i=1;i<=n;i++) {
			if(i%5==0 && i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void DivisibleBy2and3(int n) {
		System.out.println("numbers divisble by 2&3");
		for (int i=1;i<=n;i++) {
			if(i%2==0 && i%3==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public static void oddDivisibleBy5(int n) {
		System.out.println("numbers divisble by odd&5");
		for (int i=1;i<=n;i++) {
			if(i%2!=0 && i%5==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter");
int n=s.nextInt();
DivisibleBy2(n);
DivisibleBy3(n);
DivisibleBy5(n);
DivisibleBy2and5(n);
DivisibleBy3and5(n);
DivisibleBy2and3(n);
oddDivisibleBy5(n);
s.close();
	}

}
