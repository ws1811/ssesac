package oop3;

public class AnimalTest {

	public static void main(String[] args) {
//		//upcasting
//		Animal a = new Condor();
//		System.out.println(a.toString());
//		// 새를 보면서 "동물이다" 라고 할 수 있지만 결국 가리키는 것은 새
//		Bird b = (Bird) a;
//		System.out.println(b.toString());
//		
//		// subclass로 downcasting 불가
//		// 
//		Condor c = null;
//		if (c instanceof Condor) {
//			c = (Condor) b;
//			System.out.println(c.toString());
//		}else {
//			System.out.println("downcasting 불가");
//		}
//		
//		if (c instanceof BlackVulture)
//		{
//			BlackVulture bv = (BlackVulture) c;
//			System.out.println(bv.toString());
//		}
//		else
//		{
//			System.out.println("downcasting 불가");
//		}
		Cat c = new Cat();
		System.out.println(c.toString());
		
		Animal a = c;
		System.out.println(a.toString());
		
		Bird b = null;
		if (a instanceof Bird)
		{
			b = (Bird) a;
			System.out.println(b.toString());
		}else
		{
			System.out.println("에러입니다...");
		}
	}

}
