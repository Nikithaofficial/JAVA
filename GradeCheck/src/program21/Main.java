package program21;

import java.util.Scanner;

public class Main {
	public static void GradeCheck(int grade) {
		if(grade>50) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int grade=s.nextInt();
GradeCheck(grade);
	}

}
