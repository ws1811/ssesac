package oop5;

public class Point2D{
	int x;
	int y;
	
//	public Point2D(int x, int y) {
//		//super(); 
//		//super class의(Object) 생성자를 수행하고 돌아온다
//		this.x = x;
//		this.y = y;
//	}

	// 단 하나라도 생성자가있으면
	// JVM 이 default constructor를 정의하지 않는다
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x, y)수행");
	}

	public Point2D() {
		this(1, 2);
		System.out.println("Point2D()수행");
	}
}
