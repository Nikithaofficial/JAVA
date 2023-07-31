
public class ArmStrongNumber {
void Find(int n) {
	
	int on=n;
	int arm=0;
	int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
	n=on;
	while(n>0) {
		int rem =n%10;
		int number=(int) Math.pow(rem, count);
		arm=arm+number;
		n=n/10;
	}
	if(on==arm) {
		System.out.println("armStrong");
	}
	else {
		System.out.println("not");
	}
	
}
}
