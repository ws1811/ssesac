package exception;


// 1. 하위 메서드에 직접 예외처리 할 때
class AT1 {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Class cls = Class.forName("java.lang.Object");
			Thread.sleep(1000);
		} catch (InterruptedException | ClassNotFoundException e) {
			// TODO: handle exception
		}
	}
}

// 2. 예외를 호출 메서드로 전가할 때
class BT1 {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException | ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException, ClassNotFoundException{
		Class cls = Class.forName("java.lang.Object");
		Thread.sleep(1000);
	}
}
public class ThrowsException3 {

}
