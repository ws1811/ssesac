package exception;

class Aa {}
class B extends Aa {}
		

public class UncheckedException {
	public static void main(String[] args) {
		// 1. Arithmetic Exception
		//System.out.println(3 / 0);
		
		// 2. ClassCastException
//		A a = new A();
//		B b = (B) a;
		
		// 3. ArrayIndexOutOfBoundsException
//		int[] array = {1, 2, 3};
//		System.out.println(array[3]);
		
		// 4. NumberFormatException
//		int num = Integer.parseInt("10!");
		
		// 5. NullPointerException
		String str= null;
		System.out.println(str.charAt(2));
	}
}
