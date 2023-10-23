package control;

public class DoWhileTest4 {
	public static void main(String[] args) {

		int i = 10;
		while (i <= 30)
		{
			System.out.println(i + " Hello World!");
			i += 10;
		}
		
		i = 1;
		do {
			System.out.println(i + " Hello World!");
			i++;
		}while (i <= 3);
	}
}
