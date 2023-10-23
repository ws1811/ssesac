package thread7;

//공유 객체
class MyData2{
	int data = 3;
	
	public void plusData() {
		synchronized (this) {
			int mydata = data; // data 가져오기
			try {Thread.sleep(1000);} catch (Exception e) {}
			data = mydata + 1;
		}
		
	}
}

// 공유 객체를 사용하는 쓰레드
class PlusThread2 extends Thread {
	MyData2 myData;
	public PlusThread2(MyData2 myData) {
		this.myData = myData;
	}
	@Override
	public void run() {
		myData.plusData();
		System.out.println(getName() + "실행 결과 : " + myData.data);
	}
}
public class SynchronizedBlock {

	public static void main(String[] args) {
		// 공유 객체 생성
		MyData1 myData = new MyData1();
		
		// plusThread1
		Thread plusThread1 = new PlusThread1(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {Thread.sleep(1000);}catch (Exception e) {}
		
		// plusThread2
		Thread plusThread2 = new PlusThread1(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();

	}

}
