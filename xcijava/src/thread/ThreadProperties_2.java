package thread;

//우선순위
class MyThread extends Thread {
	@Override
	public void run() {
		for(long i=0; i<2147483647; i++) {} // 시간 지연용
		System.out.println(getName() + " 우선순위 : " + getPriority());
	}
}

public class ThreadProperties_2 {
	public static void main(String[] args) {
		// CPU 코어 수
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		// 우선순위 자동 지정
		for(int i=0;i<3;i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		// 우선순위 직접 지정
		Thread[] thread = new Thread[20];
		for(int i=0; i<thread.length;i++) {
			thread[i] = new MyThread();
			thread[i].setName(i + "번째 쓰레드");
			if (i == thread.length - 1)thread[i].setPriority(10);
		}
		for(int i=0; i<thread.length;i++) {
			thread[i].start();
		}
//		for(int i=0; i<20; i++) {
//			Thread thread = new MyThread();
//			thread.setName(i + "번째 쓰레드");
//			if (i == 9) thread.setPriority(10);
//			thread.start();
//		}
	}
}
