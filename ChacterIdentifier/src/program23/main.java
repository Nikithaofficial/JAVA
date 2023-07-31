package program23;

import java.util.Scanner;

public class main{

public static void identifyCharacter(Character ch)
{
/*if(Character.isUpperCase(ch)) {
	System.out.println("character is in uppercase");
}else if(!Character.isLetter(ch)||  Character.isLowerCase(ch)) {
	System.out.println("character is in lowercase");
}else if(Character.isDigit(ch)) {
	System.out.println("character is digit");
}else {
	System.out.println("its a special character");
}
}
*/
	if(Character.isDigit(ch)) {
		System.out.println("character is digit");
	}
	else if(!Character.isLetter(ch)) {
		System.out.println("its a special character");	
		}
	else {
		switch(Character.toLowerCase(ch)) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			if(Character.isUpperCase(ch)) {
				System.out.println("its a uppercase vowel");
			}
			else {
				System.out.println("its a lowercase vowel");
			}
			break;
			default:
				if(Character.isUpperCase(ch)) {
					
					System.out.println("its a uppercase consonant");
				}
				else {
					System.out.println("its a lowercase consonant");
				}
		}
	}
	}
public static void main(String[] args)

{
	Scanner s=new Scanner(System.in);
	char c=s.next().charAt(0);
	identifyCharacter(c);
}

}


