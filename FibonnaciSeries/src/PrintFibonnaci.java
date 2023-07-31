import java.util.Scanner;

public class PrintFibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter ");
int n=s.nextInt();
Print(n);

	}
public static void Print(int n) {
	int f1=0;
	int f2=1;
	if(n==1) {
		System.out.println(f1);
	}
	else if(n==2) {
		System.out.print(f1+" "+f2);
	}
	else
	{
		System.out.print(f1+" "+f2+" ");
		for(int i=3;i<=n;i++) {
			int nextno=f1+f2;
			System.out.print(nextno+" ");
			f1=f2;
			f2=nextno;
			
		}
	}
			}
}
