package nested;



interface C {
	public abstract void bcd();
}

class AA{
	C c = new B();
	void abc() {
		c.bcd();
	}
	class B implements C {
		public void bcd() {
			System.out.println("인스턴스 이너 클래스");
		}
	}
}
public class AnnonymousClass1 {
	public static void main(String[] args) {
		AA a = new AA();
		a.abc();
	}
}
