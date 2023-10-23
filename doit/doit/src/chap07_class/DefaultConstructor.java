package chap07_class;

public class DefaultConstructor {
	
}

class AA {
	int m;
	void work()
	{
		System.out.println("m");
	}
}

class B {
	int m;
	void work() 
	{
		System.out.println("m");
	}
	
	B() {
		
	}
}

class C {
	int m;
	void work() 
	{
		System.out.println("m");
	}
	
	C(int a) {
		m = a;
	}
}
