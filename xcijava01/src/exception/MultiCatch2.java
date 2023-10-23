package exception;

public class MultiCatch2 {
	public static void main(String[] args) {
		
		// 1. catch 블록 순서가 잘못됐을 때
//		try {
//			System.out.println(3 / 0);
//			int num = Integer.parseInt("10A");
//		} catch (Exception e) {
//			System.out.println("숫자로 바꿀 수 업습니다");
//		} catch (NumberFormatException e) {
//			System.out.println("숫자로 바꿀 수 업습니다");
//		}finally {
//			System.out.println("프로그램 종료");
//		}
		
		// 2. catch 블록의 올바른 순서
		try {
			System.out.println(3 / 0);
			int num = Integer.parseInt("10A");
		}catch (NumberFormatException e) {
			System.out.println("숫자로 바꿀 수 업습니다");
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("프로그램 종료");
		}
	}
}
