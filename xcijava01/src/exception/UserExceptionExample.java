package exception;

//점수가 음수일 때 예외 
class MinusException extends Exception {
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}
//점수가 100점 초과일 때 예외 발생
class OverException extends Exception {
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

class AUE {
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0) {
			throw new MinusException("예외 발생 : 음수값 입력");
		}else if (score > 100) {
			throw new OverException("예외 발생 : 100점 초과");
		}else {
			System.out.println("정상적인 값입니다.");
		}
	}
}

public class UserExceptionExample {
	public static void main(String[] args) {
		
		AUE a = new AUE();
		try {
			a.checkScore(85);
			a.checkScore(115);
		} catch (MinusException|OverException e) {
			System.out.println(e.getMessage());
		}
	}
}
