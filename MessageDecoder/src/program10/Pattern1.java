package program10;

public class Pattern1 {

	public static void main(String[] args) {
		int n=3;
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j<=0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
