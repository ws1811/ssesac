package exception;

class MyResource implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("자원반납");
	}
	
}
public class ExceptionTest2 {
	public static void main(String[] args) {
		
		try (MyResource m = new MyResource()){
			System.out.println("try block");
			if(true) throw new RuntimeException("강제 예외 발생");
			System.out.println("A");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch block : " + e.getMessage());
		}
		System.out.println("종료");
	}
}
