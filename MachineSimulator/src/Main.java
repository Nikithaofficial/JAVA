import java.util.Scanner;

public class Main {
public static void GetProduct(String productcode) {
	switch(productcode){
	case "P01":
		System.out.println("coca cola");
		break;
	case "P02":
		System.out.println("7up");
		break;
	case "P03":
		System.out.println("string");
		break;
	case "P04":
		System.out.println("maaza");
		break;
		default:
			System.out.println("the requried product is not available");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("P01----coca cola");
		System.out.println("P02----7up");
		System.out.println("P03----string");
		System.out.println("P04----maaza");
			System.out.println("enter product code with the help of below menu");
		String st=s.next();
		GetProduct(st);

	}

}
