
public class ReverseNmber {
void ReverseNum(int n) {
	int on=n;
	int reverse=0;
	while(n>0) {
		int rem=n%10;
		reverse=reverse*10+rem;
		n=n/10;
	}
	System.out.println("reerse of number is "+reverse);
	if(on==reverse) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
	
}
}
