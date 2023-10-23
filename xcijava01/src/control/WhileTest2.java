package control;

public class WhileTest2 {

	public static void main(String[] args) {

		// 1부터 1000까지 3의 배수의 합계를 구해보세요
//		int sum = 0;
//		for (int i = 3; i <= 1000; i += 3)
//		{
//			//System.out.printf("[i = %d]\n", i);
//			sum += i;
//		}
		int sum = 0;
		int i = 3;
		while (i <= 1000)
		{
			sum += i;
			i += 3;
		}
		
		System.out.println(sum);
	}

}
