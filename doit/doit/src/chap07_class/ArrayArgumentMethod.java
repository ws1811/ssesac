package chap07_class;

import java.util.Arrays;

public class ArrayArgumentMethod {

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, 3};
		printAraay(a);
		printAraay(new int[] {1, 2, 3});
	}
	
	public static void printAraay(int[] a)
	{
		System.out.println(Arrays.toString(a));
	}

}
