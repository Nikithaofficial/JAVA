package program4;

public class JoinString {
	public static void lengthString(String s,int i,int count) {
		
	
		if(s.charAt(i)=='/') {
			System.out.println(count);
			return ;
		}
		
		lengthString(s,i+1,count+1);
		
		
	}

	public static void main(String[] args) {
		String s="nikitha";
		s=s+"/";
		lengthString(s,0,0);
		//lengthString("hello",0,0);
		// TODO Auto-generated method stub
//System.out.println(joinStrings("Hello, ", "World!"));
	}
	/*public static String joinStrings(String str1, String str2) {
		return str1+str2;
	}*/
}
