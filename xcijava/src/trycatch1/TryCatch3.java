package trycatch1;

public class TryCatch3 {

	public static void main(String[] args) {
		//1.catch 블록의 순서가 잘못됐을 때
//		try {
//			System.out.println(3 / 1);
//			int num = Integer.parseInt("10A");
//		} catch (Exception e) {
//			System.out.println("숫자는 0으로 나눌 수 없습니다.");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 없습니다.");   //unreachable code 오류 발
//		}  finally {
//			System.out.println("프로그램 종료");
//		}
		
		// 2. catch 블록의 올바른 순서
		try {
			System.out.println(3 / 1);
			int num = Integer.parseInt("10A");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 없습니다.");
		} catch (Exception e) {
			System.out.println("숫자는 0으로 나눌 수 없습니다.");
		}  finally {
			System.out.println("프로그램 종료");
		}
		
	
	
	}

}
