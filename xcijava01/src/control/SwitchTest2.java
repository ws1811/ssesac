package control;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("0 ~ 100 사이의 점수 입력 >> ");
		int score = scan.nextInt();
		
		switch (score/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			break;
		}
	}

}
