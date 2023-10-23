package nested;


class A2 {
	int a = 3;
	static int b = 4;
	
	void method1() {
		System.out.println("instance method");
	}
	
	static void method2() {
		System.out.println("static method");
	}
	//정적 이너 클래스
	static class B {
		void bcd () {
			//필드 사용
			System.out.println(b);
			//메서드 호출
			//method1();
			method2();
		}
	}
}


public class CreateObjectAndAccessMember2 {
	public static void main(String[] args) {
		//정적 이너 클래스의 객체 생성
		A2.B b= new A2.B();
		b.bcd();
	}
}
