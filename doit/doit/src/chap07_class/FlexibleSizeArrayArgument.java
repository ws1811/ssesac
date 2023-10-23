package chap07_class;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		method1(1, 2);
		method1(1, 2, 3);
		method1();
	}
	
	public static void method1(int... values)
	{
		System.out.println("# 배열의 길이 : " + values.length);
		for(int k : values)
		{
			System.out.print(k + " ");
		}
		System.out.println();
	}

}
