package inner4;

class A{
	int a = 3; //필드
	void abc() {
		int b = 5; //지역 벼ㅕㄴ수
		// 지역 이너 클래스
		class B {
			void bcd() {
				System.out.println(a);
				System.out.println(b);
				a = 5;
				// b = 7; 지역 이너 클래스에서 사용하는 지역 변수는 자동 final 선
			}
		}
		
		B bb = new B();
		bb.bcd();
	}
	
}


public class LocalVariable {

	public static void main(String[] args) {
		//객체 생성 및 메서드 호출
		A a = new A();
		a.abc();
	}

}
