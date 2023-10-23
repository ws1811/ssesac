package basic;

public class OpTest10 {

	public static void main(String[] args) {
		int n = 0;
		// n이 양수인지 음수인지 판별
		// 짝수인지 홀수인지 판별
		System.out.println( (n > 0)? "양수" : 
							(n < 0)? "음수" : "양수도 음수도 아님");
		System.out.println((n % 2 == 0)? "짝수" : "홀수");
		// System.out.println((n % 2 == 1)? "홀수" : "짝수"); % 연산 사용할 때 주의 -> 부호연산자도 따라감
		System.err.println((n == 1 || n == 3)? "남자" :
							(n == 2 || n == 4)? "여자" : "남자도 여자도 아님");
		
		
	}

}
