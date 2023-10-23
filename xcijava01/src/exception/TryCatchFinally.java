package exception;

public class TryCatchFinally {
	public static void main(String[] args) {
		// 1. try - catch
		try {
			System.out.println(3 / 0);
			System.out.println("프로그램 종료");
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다");
			System.out.println("프로그램 종료");
		}
		
		// 2. try - catch - finally
		try {
			System.out.println(3 / 0);
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다");
			
		}finally {
			System.out.println("프로그램 종료");
		}
		
		
		
		
	}
}
