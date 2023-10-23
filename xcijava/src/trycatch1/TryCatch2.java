package trycatch1;

public class TryCatch2 {

	public static void main(String[] args) {
		//1.단일 try-catch
		try {
			System.out.println(3 / 0);
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
		
		
		try {
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} finally {
			System.out.println("프로그램 종료");
		}
		System.out.println();
	
		try {
			System.out.println(3 / 0);
			int num = Integer.parseInt("10A");
		} catch (ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		}  finally {
			System.out.println("프로그램 종료");
		}
	
	
	
	}

}
