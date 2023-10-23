package basic;

import java.math.BigDecimal;
import java.math.BigInteger;

public class PrimitiveTypeTest {
	public static void main(String[] args) {
		boolean b = true;
		System.out.println(b);
		
		byte b2 = 127;
		System.out.println(b2);
		
		char c = '가';  // char 타입 -> single quote(' ')
		System.out.println(c);
		
		short s = 23767;
		System.out.println(s);
		
		int i = 2147483647 + 1;
		System.out.println(i);
		
		long l1 = 2147483648L; //정수 리터럴의 기본 타입 : int(4byte) / 범위를 벗어나는 경우 표시해줘야
		System.out.println(l1);
		
		double p = 3.1415926535;
		System.out.println(p);
		
		float f = 3.14159263535f; // 실수 리터럴 기본 타입 : double / float 사용하기 위해선 f 사용
		System.out.println(f);    // float : double 에 비해 정밀도 떨어짐 (대략 소숫점 7자리)
		
		System.out.println(2- 1.1);
		BigDecimal bd1 = new BigDecimal("2");  //조금 더 정밀
		BigDecimal bd2 = new BigDecimal("1.1"); //리터럴을 넣어주는 순간 깨짐 -> 정확하게 하기 위해선 문자열로
		System.out.println(bd1.subtract(bd2)); // 그래도 정확한 값은 X 
		
		double pi = Math.PI;
		System.out.println(pi);
	}
}
