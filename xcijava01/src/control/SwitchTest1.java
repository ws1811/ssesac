package control;

public class SwitchTest1 {

	public static void main(String[] args) {
		int n = 2;
		
		switch (n) {
		case 1:
		case 3:
			System.out.println("남");
			break;
		case 2:
		case 4:
			System.out.println("여");
			break;			
		default :
			System.out.println("에러");
			break; // default 는 break 필요없긴 하지만 보통 쓴다
		}
	}

}
