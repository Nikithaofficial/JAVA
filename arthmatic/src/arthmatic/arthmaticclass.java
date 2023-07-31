package arthmatic;

public class arthmaticclass {
public static void main(String[] args) {
	System.out.println(subtractNumbers(20, 5));

	System.out.println(multiplyNumbers(4, 5));
	double res=divideNumbers(100, 3);

	System.out.printf("%.1f",res);

System.out.println(	findRemainder(10, 3));
	
}
public static int subtractNumbers(int num1, int num2) {
	return num2-num1;
}
public static int multiplyNumbers(int num1, int num2) {
	return num1*num2;
}
public static double divideNumbers(double num1, double num2) {
	return num1/num2;
	/* d=(d*1000);
	 System.out.println(d);
	int ab=(int)d;
	
	double a=ab%10;
	if(a<5) {
		d=d/1000;
	}
	else
	{
		d=(d+1)/1000;
	}
	return d;
	*/
	
	
}
public static int findRemainder(int num1, int num2) {
	return num1%num2;
}
}
