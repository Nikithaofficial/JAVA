
public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println(FindSum(5));
	}
public static double FindSum(int n) {
	double sum=1;
	for(double i=2;i<=n;i++) {
	     double num=1/i;
	     sum=sum+num;
	}
	return sum;
}
}
