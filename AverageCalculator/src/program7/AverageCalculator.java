package program7;

public class AverageCalculator {

	public static void main(String[] args) {
		System.out.printf("%.2f",calculateAverage(85, 79, 91, 76,88, 95, 80, 85));
		// TODO Auto-generated method stub

	}
	public static double calculateAverage(double sem1, double sem2, double sem3, double sem4, double sem5, double sem6,double sem7,double sem8) {
		return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8;
	}
}
