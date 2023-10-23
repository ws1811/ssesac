package method;

import java.util.Scanner;

public class MethodTest3 {
	public static void main(String[] args) {
		print(1);
		print(2, 3);
		print(4, 5, 6);
		print(1,32,633,43,51,645,523,26,75,453,421,432,5123,213,235,4534,632,112,3213,42);
	}

	//가변형 argument 받기 ->	  배열형태로 받아짐
	private static void print(int... i) {
		for(int j=0;j<i.length;j++)
		{
			System.out.print(i[j]+" ");
		}
		System.out.println();
	}
	
	
	
	// 메소드 오버로드 (method overloading, 메소드 중복정의)
//	private static void print(int i, int j) {
//		System.out.println(i + "," + j);
//	}
//
//	private static void print(int i) {
//		System.out.println(i);
//	}
//
//	private static void print(int i, int j, int k) {
//		System.out.println(i+","+j+","+k);
//	}

}
