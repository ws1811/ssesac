package chap10_inheritance;

/* 캐스팅의 가능 여부를 확인할 수 있는 instanceof */

class A2 {}
class B2 extends A2 {}

public class Typecasting_3 {

	public static void main(String[] args) {
		// instanceof
		A2 aa = new A2();
		A2 ab = new B2();
		
		System.out.println(aa instanceof A2);
		System.out.println(ab instanceof A2);
		
		System.out.println(aa instanceof B2); //false
		System.out.println(ab instanceof B2);
		
		if (aa instanceof B2)
		{
			B2 b = (B2) aa;
			System.out.println("aa 를 B2로 캐스팅했습니다");
		}else {
			System.out.println("aa 는 B2 타입으로 캐스팅 불가능!");
		}
		
		if (ab instanceof B2)
		{
			B2 b = (B2) ab;
			System.out.println("ab 를 B2로 캐스팅했습니다");
		}else {
			System.out.println("ab 는 B2 타입으로 캐스팅 불가능!");
		}
		
		if ("안녕" instanceof String)
		{
			System.out.println("\"안녕\"은 String 클래스 입니다.");
		}

	}

}
