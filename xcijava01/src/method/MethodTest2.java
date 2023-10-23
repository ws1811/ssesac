package method;

import java.util.Scanner;

public class MethodTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 2개를 입력하세요 > ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a + " + " + b + " = " + add(a,b));
		
		System.out.println("주사위 값은 " + dice());
	}

	private static int dice() {
		return (int)(Math.random() * 6) + 1;
	}

	private static int add(int a, int b) {
		return a + b;
	}
}
