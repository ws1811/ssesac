package control;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s, b, count;
		int c1, c2, c3; //난수
		int h1, h2, h3;
		
		/* 난수 생성 */
		c1 = (int)(Math.random() * 10);
		do {
			c2 = (int) (Math.random() * 10);
		} while (c1 == c2);
		do {
			c3 = (int) (Math.random() * 10);
		} while (c1 == c3 || c2 == c3);
		
		count = 0;
		do {
			System.out.print("0 ~ 9 사이의 중복되지 않은 숫자 3개 입력 (ex : 1 2 3) >> ");
			s = b = 0;
			h1 = scan.nextInt();
			h2 = scan.nextInt();
			h3 = scan.nextInt();
			
			if (h1 == c1) s++;
			else if(h1 == c2 || h1 == c3) b++;
			if (h2 == c2) s++;
			else if (h2 == c1 || h1 == c3)b++;
			if (h3 == c3) s++;
			else if (h3 == c1 || h3 == c2)b++;
			System.out.printf("%d %d %d : [%dS][%dB]\n", h1, h2, h3, s, b);
			count++;
		}while(s != 3);
		System.out.printf("*** 축하합니다 ! %d번 만에 맞추셨습니다 !! ***\n", count);
	}

}
