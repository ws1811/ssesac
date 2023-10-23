package control;

public class WhileTest3 {

	public static void main(String[] args) {
		
		
		int c = 0;
		while (c <= 1)
		{
			int second = 1;
			while (second <= 9)
			{
				int first = 2;
				while (first <= 5)
				{
					System.out.print((first + 4 * c) + " * " + second + " = " + (first + 4 * c) * second + "\t");
					first++;
				}
				System.out.println();
				second++;
			}
			System.out.println();
			c++;
		}
	}

}
