package thread;

class MyThread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" : "+ (isDaemon()? "데몬쓰레드" : "일반쓰레드"));
		for(int i=0;i<6;i++) {
			System.out.println(getName() + " : " + i + "초");
			try {Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
}
public class ThreadProperties_3_1 {
	public static void main(String[] args) {
		//일반 쓰레드
		Thread thread1 = new MyThread1();
		thread1.setDaemon(false); 
		thread1.setName("thread1");
		thread1.start();
		
		// 3.5초후 main 쓰레드 종료
		try {Thread.sleep(3500);} catch(InterruptedException e) {}
		System.out.println("main Thread 종료");
	}
}
