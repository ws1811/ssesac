package oop2;

public class PointTest {

	public static void main(String[] args) {
		Point2D pt = new Point3D(); //upcasting : 자동형변환(묵시적형변환)
									//ex) exception
		
		pt.x = 100;
		pt.y = 200;
		
		//pt.z = 100;
		Point3D pt2 = (Point3D) pt; //downcasting : 강제형변환(명시적형변환)
		System.out.println(pt2.x);
		System.out.println(pt2.y);
		System.out.println(pt2.z);
	}

}
