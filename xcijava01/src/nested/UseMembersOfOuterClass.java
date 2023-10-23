package nested;

class A1{
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	
	// 인스턴스 이너 클래스 정의
	class B{
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 메서드");
		}
		void bcd() {
			//이너 클래스의 멤버 호출 또는 사용
			System.out.println(a);
			System.out.println(b);
			abc();
			
			//아우터 클래스의 멤버 호출 또는 사용
			System.out.println(A1.this.a);
			System.out.println(A1.this.b);
			A1.this.abc();
		}
	}
}
public class UseMembersOfOuterClass {
	public static void main(String[] args) {
		//아우터 클래스 객체 생성
		A1 a = new A1();
		
		//이너 클래스 객체 생성
		A1.B b = a.new B();
		b.bcd();
	}
}
