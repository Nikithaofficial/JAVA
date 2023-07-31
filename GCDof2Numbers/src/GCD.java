
public class GCD {
public static int FindGCD(int m,int n) {
	while(n!=0) {
		int r=m%n;
		m=n;
	    n=r;
	}
	return m;
}
}
