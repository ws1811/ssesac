package basic;

public class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World"); 
		
		System.out.print("Hello");
		System.out.println("SeSAC");

		System.out.print("Java");
		System.out.println("안녕" + " 반가워");
		System.out.println(10 + 20);
		System.out.println("내 키는 170에 10cm 구두를 신었으니 " + 170 + 10);
		System.out.println("내 키는 170에 10cm 구두를 신었으니 " + (170 + 10));
		System.out.println("hello\nworld"); // escape sequence
		System.out.println("\\");
		System.out.println("a\tb\tc");
		System.out.printf("%d\n", 30);
		System.out.printf("%o\n", 30);
		System.out.printf("%x\n", 30);
		System.out.printf("%f\n", 5.8);
		System.out.printf("%4.2f\n", 5.8);
	}
}
