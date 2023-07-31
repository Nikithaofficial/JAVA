import java.util.Scanner;

public class Mian {
public static void IdentifyPolygon(int n) {
	switch(n) {
	case 3:
		System.out.println("triangle");
		break;
	case 4:
		System.out.println("Quadrilateral");
		break;
	case 5:
		System.out.println("Pentagon");
		break;
	case 6:
		System.out.println("Hexagon");
		break;
	default:
		System.out.println("Polygon");
		break;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
int n=s.nextInt();
IdentifyPolygon(n);
	}

}
