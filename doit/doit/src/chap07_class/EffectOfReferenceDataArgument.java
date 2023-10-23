package chap07_class;

import java.util.Arrays;

public class EffectOfReferenceDataArgument {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3};
		modifyData(arr);
		printArray(arr);
	}

	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	private static void modifyData(int[] a) {
		a[0] = 4;
		a[1] = 5;
		a[2] = 6;
	}
	
	

}
