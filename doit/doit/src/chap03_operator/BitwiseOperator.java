package chap03_operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		// 자바 메서드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println();
		
		System.out.println(Integer.parseInt("1101", 2));
		System.out.println(Integer.parseInt("15", 8));
	}

}
