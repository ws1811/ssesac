package array;

import java.util.Arrays;

public class ArrayTest2 {
	public static void main(String[] args) {
		// 행 열
		int[][] score = {
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
		};
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for (int row=0; row<score.length;row++)
		{
			int sum = 0;
			int avg = 0;
			for(int col=0;col<score[row].length;col++)
			{
				sum += score[row][col];
				System.out.print(score[row][col]+ "\t");
			}
			System.out.print(sum + "\t");
			System.out.print((double)(sum / score[row].length) + "\t");
			System.out.println();
		}
		
		System.out.println("======================");
		
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for(int[] col: score)
		{
			int sum=0, avg=0;
			for(int n: col)
			{
				sum += n;
				System.out.print(n+"\t");
			}
			System.out.print(sum + "\t" + ((double)sum/col.length));
			System.out.println();
		}
		
	}
}
