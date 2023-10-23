package basic;

public class OpTest4 {

	public static void main(String[] args) {
		int a = 10; // 1010(2)
		int b = 4;
		System.out.println(a & b);
		
		int i = 10;
		int j = 5;
		
		i ^= j;
		i ^= j;
		i ^= j;
		System.out.println(i + ", " + j);
		
		int n = 10;
		System.out.println(n << 2); // <<, >> 한번 이동마다 2배
	}

}
