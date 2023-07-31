import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();

System.out.println(GCD.FindGCD(m, n));
s.close();
	}

}
