package control;

import java.util.Scanner;

public class IfTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0 ~ 100 사이의 점수를 입력 >> ");
		int score = scan.nextInt();
		
//		if (90 <= score && score <= 100) System.out.println("A");
//		if (80 <= score && score < 90) System.out.println("B");
//		if (70 <= score && score < 80) System.out.println("C");
//		if (60 <= score && score < 70) System.out.println("D");
//		if (0 <= score && score < 60) System.out.println("F");
		
		if (90 <= score) System.out.println("A");
		else if (score >= 80) System.out.println("B");
		else if (score >= 70) System.out.println("C");
		else if (score >= 60) System.out.println("D");
		else System.out.println("F");

	}

}
