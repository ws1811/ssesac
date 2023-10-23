package oop1;

public class Point2D {
	// 필드(멤버 변수)
	private int x;
	private int y;
	
	//Getter & Setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void print()
	{
		System.out.println("x = " + this.getX());
		System.out.println("y = " + this.getY());
		//System.out.println("z = " + this.getZ());
	}
}


