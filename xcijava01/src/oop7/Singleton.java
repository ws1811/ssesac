package oop7;

public class Singleton {
	public static Singleton singleton = null;
	
	int score;
	
	// 1. 생성자를 private 으로 만든다
	private Singleton(){}	
	// 2. 자기자신을 참조하는 변수를 static 으로 선언
	// 3. 처음 1회만 인스턴스 생성하고 리턴하는 메소드 작성
	//    (관례 : getInstance())
	// 4. Class명.getInstance()로 싱글톤 인스턴스 획득
	public static Singleton getInstance() {
		if (singleton == null)
		{
			singleton = new Singleton();
		}
		return singleton;
	}
	
}
