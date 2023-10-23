package control;

public class ForTest3 {

	public static void main(String[] args) {
		
//		for (int c=0; c<2; c++)
//		{
//			for (int i=2; i<=9; i++)
//			{
//				for (int j= 0; j< 4; j++)
//				{
//					System.out.print((2 + j*4 + c) + " x " + i + " = " + i * (2 + j*4 + c) + "\t");
//				}
//				System.out.println("i = " + i);
//			}
//			System.out.println();
//		}
		
		for (int i=2; i<=9; i+=4)
		{
			for(int j = 1; j <= 9; j++)
			{
				for (int k = i; k < 4 + i; k++)
				{
					System.out.print(k + " * " + j + " = " + (k * j) + "\t");
				}
				System.out.println();
			}
		}
		System.out.println();
	}

}
