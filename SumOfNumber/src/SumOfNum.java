
public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=1234;
System.out.println(SumOfNumber(n));
	}
public static int SumOfNumber(int n) {
	int sum=0;
	while(n>0) {
		int rem=n%10;
		sum+=rem;
		n=n/10;
	}
	return sum;
}
}
