package thread;

class SMIFileRunnable implements Runnable {
	@Override
	public void run() {
		// 
		String[] strArray = {"하나", "둘", "셋", "넷", "다섯"};
		try {Thread.sleep(30);}catch (InterruptedException e) {}
		//자막 번호 출력
		for (int i=0;i<strArray.length;i++) {
			System.out.println(" -(자막번호) " + strArray[i]);
			try {Thread.sleep(200);}catch (InterruptedException e) {}
		}
	}
}

public class CreateAndStartThread_M2C1 {
	public static void main(String[] args) {
		// SMIFileRunnable 객체 생성 
		Runnable smiFileRunnable = new SMIFileRunnable();
		Thread thread = new Thread(smiFileRunnable);
		thread.start();
		
		//비디오 프레임 번호 1 ~ 5
		int[] intArray = {1, 2, 3, 4 , 5};
		//비디오 프레임 번호 출력
		for(int i=0;i<intArray.length;i++) {
			System.out.print("(비디오 프레임)" + intArray[i]);
			try {Thread.sleep(200);}catch (InterruptedException e) {}
		}
	}
}
