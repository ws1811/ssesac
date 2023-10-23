package chap12_interface;

interface A {
	int a = 3;
	void abc();
}

public class CreateObjectOfInterface2 {
	public static void main(String[] args) {
		//객체 생성
		A a1 = new A () {
			public void abc() {
				System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		A a2 = new A () {
			public void abc() {
				System.out.println("방법2. 익명 이너 클래스를 이용한 객체 생성");
			}
		};
		
		// 메서드 호출
		a1.abc();
		a2.abc();
	}
}
