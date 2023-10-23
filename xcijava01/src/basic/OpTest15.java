package basic;

public class OpTest15 {

	public static void main(String[] args) {
		// 1~6 사이의 난수
		int dice = (int)(Math.random() * 6) + 1; // Math.random : 0.0 ~ 0.99999.... 사이 난수
		
		// Q1. 4 ~ 15 사이의 정수 난수 발생
		//int q1 = (int)(Math.random() * 12) + 4;
		for (int i=0; i < 10; i++)
		{
			int q1 = (int)(Math.random() * 12) + 4;
			System.out.println(q1);
		}
		// Q2. 반드시 아래 숫자로만 난수 발생
		// 600, 700, 800, 900, 1000, 1100, 1200, 1300, 
		// 1400, 1500, 1600, 1700, 1800, 1900, 2000, 2100, 2200, 2300
		
		//int q2 = ((int)(Math.random() * 18) + 6) * 100;
		for (int i=0; i < 10; i++)
		{
			int q2 = ((int)(Math.random() * 18) + 6) * 100;
			System.out.println(q2);
		}
		

	}

}
