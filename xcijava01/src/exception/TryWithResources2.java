package exception;

class AC implements AutoCloseable {
	String resource;
	AC(String resource) {
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {
		if (resource != null)
		{
			resource = null;
			System.out.println("리소스가 해제되었습니다");
		}
	}
	
}
public class TryWithResources2 {

	public static void main(String[] args) {
		
		// 1.  수동
		AC ac1 = null;
		try {
			ac1 = new AC("특정 파일");
		} catch (Exception e) {
			System.out.println("예외처리...");
		} finally {
			//리소스 수동 해제
			if (ac1.resource != null) 
			{
				try {
					ac1.close();
				}catch(Exception e) {}
			}
		}
		
		// 2. 자동
		try (AC ac2 = new AC("특정파일")){
			System.out.println("HelloWorld");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("예외처리");
		}
	}

}
