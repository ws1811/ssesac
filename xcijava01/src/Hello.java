
public class Hello{
	public static void main(String[] args)
	{
		int i = 1;
		while (i < args.length())
		{
			System.out.printf("args[%d] = %s", i, args[i]);
			i++;
		}
	}
}
