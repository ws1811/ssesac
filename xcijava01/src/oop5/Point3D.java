package oop5;

public class Point3D extends Point2D{
	int z;
	
	//JVM이 만들어줄 디폴트 생성자
//	public Point3D() {
//		super();
//	}
	
	public Point3D(int x, int y, int z) {
//		this.x = x;
//		this.y = y;
//		this.z = z;
		super(x, y);
		this.z = z;
		System.out.println("Point3D(x,y,z) 수행..");
	}
	
	public Point3D() {
		this(10, 20, 30);
	}
}
