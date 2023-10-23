package chap10_inheritance;

class A1 {
	int m = 3;
	void abc() {
		System.out.println("A 클래스");
	}
}

class B1 extends A1{
	int n = 3;
	void bcd() {
		System.out.println("B 클래스");
	}
}

public class Typecasting_2 {

	public static void main(String[] args) {
		// A타입 / A 생성자
		A1 aa = new A1();
		System.out.println(aa.m);
		aa.abc();
		
		// A타입 / A 생성자
		B1 bb = new B1();
		System.out.println(bb.n);
		bb.bcd();
		
		// A타입 / B 생성자 : 다형적 표현
		A1 ab = new B1();
		System.out.println(ab.m);
		ab.abc();

	}

}
