package exception;

// 1
class AT {
	void abc() {
		bcd();
	}
	void bcd() {
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// 2
class BT {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException {
		Thread.sleep(1000);
	}
	
}
public class ThrowsException1 {

	public static void main(String[] args) {

	}

}
