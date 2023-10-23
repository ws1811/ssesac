package control;

public class ForTest2 {

	public static void main(String[] args) {
//		// 1부터 1000까지 정수의 합계를 구해보세요
//		int sum = 0;
//		for (int i = 1; i <= 1000; i++)
//		{
//			sum += i;
//		}
//		System.out.println(sum);
		// 1부터 1000까지 3의 배수의 합계를 구해보세요
		int sum = 0;
		for (int i = 3; i <= 1000; i += 3)
		{
			//System.out.printf("[i = %d]\n", i);
			sum += i;
		}
		System.out.println(sum);
	}

}
