package basic;

public class OpTest6 {

	public static void main(String[] args) {
		double seedMoney = 1_000_000;
		for (int i = 0; i < 100; i++)
		{
			seedMoney = seedMoney + (seedMoney/2 * 0.4); // 40% 수익		
			seedMoney = seedMoney - (seedMoney/2 * 0.3); // 다시 30% 손실
			System.out.println(seedMoney);
		}		
		System.out.println(seedMoney);
	}

}
