package oop2;

public class PointTest {

	public static void main(String[] args) {
		// 자식 인스턴스를 부모타입이 참조할 수는 있음
		// 자식에서 새롭게 생성된 필드에는 접근할 수 없다
		// 업캐스팅(upcasting)-> 자동형변환
		Point2D pt = new Point3D();
		pt.x = 100;
		pt.y = 200;
		//pt.z = 300;
		Point3D pt2 = (Point3D)pt;
		System.out.println(pt2.x);
		System.out.println(pt2.y);
		System.out.println(pt2.z);
	}

}
