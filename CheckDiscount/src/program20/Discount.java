package program20;

public class Discount {
	public static void CheckDiscount(int purchaseAmount) {
		if(purchaseAmount>100) {
			System.out.println("discount applicable");
		}
		else {
			System.out.println("discount not applicable");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
CheckDiscount(12);
	}

}
