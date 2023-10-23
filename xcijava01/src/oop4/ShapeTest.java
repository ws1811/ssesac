package oop4;

public class ShapeTest {

	public static void main(String[] args) {		
		printArea(new Circle());		
		printArea(new Rectangle());		
		printArea(new Triangle());
	}

	//	기반이 되는 타입(Shape)으로 받아주면 -> 자동으로 업캐스팅
	private static void printArea(Shape s) {
		s.area();
		if (s instanceof Circle) {
			Circle c = (Circle)s;
			System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.res + "입니다.");
		}else if (s instanceof Rectangle)
		{
			Rectangle r = (Rectangle)s;
			System.out.println("가로가 " + r.w + ", 세로가 " + r.h + "인 직사각형의 넓이는 " + r.res + "입니다.");
		}else if (s instanceof Triangle)
		{
			Triangle t = (Triangle)s;
			System.out.println("밑변이 " + t.w + ", 높이가 " + t.h + "인 삼각형의 넓이는 " + t.res + "입니다.");
		}
		//System.out.println(s.res);		
	}
}
