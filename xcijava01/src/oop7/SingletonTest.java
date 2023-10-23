package oop7;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s1.getClass());
		System.out.println(s1.hashCode());
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		System.out.println(s2.getClass());
		System.out.println(s2.hashCode());
	}

}
