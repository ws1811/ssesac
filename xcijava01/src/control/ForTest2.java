package control;

public class ForTest2 {

	public static void main(String[] args) {
		// 1부터 1000까지 정수의 합계
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		
		//1부터 1000까지 3의 배수의 합계
		int sum1 = 0;
		for(int i = 1 ; i < 1000; i++) {
			if(i % 3 == 0) {
				sum1 += i;
			}
		}
		
		System.out.println(sum1);

	}

}
