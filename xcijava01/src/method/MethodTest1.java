package method;

public class MethodTest1 {
	public static void main(String[] args) {
		 print();
		 print();
		 welcome("김주력");
		 welcome("송원선");
		 System.out.println("종료");
	}

	private static void welcome(String name) {
		System.out.println("------------");
		System.out.println("안녕하세요~ " + name + "님~");
		System.out.println("------------");
	}

	private static void print() {
		System.out.println("------------");
		System.out.println("이소민");
		System.out.println("------------");
	}
}
