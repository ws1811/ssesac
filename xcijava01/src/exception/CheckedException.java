package exception;

class A implements Cloneable {
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class CheckedException {
	public static void main(String[] args) {
		// Checked Exception (일반 예외)
		
		// 1. InterupptedException
		//Thread.sleep(1000);
		
		// 2. ClassNotFoundException
		//Class cls = Class.forName("java.lang.Object");
		
		// 3. IOException
		//InputStreamReader in  = new InputStreamReader(System.in);
		// 4. FileNotFoundException
		
		// 5. CloneNotsupportedException
	}
}
