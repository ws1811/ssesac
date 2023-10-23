package nested;

class A3{
	int a = 3;
	void abc () {
		//지역 변수
		int b = 5;
		//지역 이너 클래스
		class B {
			void bcd() 
			{
				System.out.println(a);
				System.out.println(b);
				a = 5;
				//b = 7;
			}
		}
		B bb = new B();
		bb.bcd();
	}
}

public class AccessMemberAndLocalVariable {
	public static void main(String[] args) {
		A3 a = new A3();
		a.abc();
	}
}
