package javalab.ch02;

import java.math.BigInteger;

/*
정수형
*/
public class IntegerVariable {

	public static void main(String[] args) {
		
		byte bVal = 20;
		short sVal = 10;
		
		System.out.println(bVal + sVal);
		
		/*int num = 12345678900; int의 최대값을 벗어난 오류
		(리터럴 기본형)*/
		long num1 = 12345678900L; // Long에 대한 literal
		
		// 정수 10, 20을 더한 값을 출력하세요.
		/*int num11 = 10;
		int num22 = 20;
		int sum = num11+ num22;
		System.out.println(sum);*/
		
		System.out.println(10 + 20);
		/* 간단한 연산만 할땐 변수선언 필요없지만,
		 * 변수가 자꾸 바뀔때는 선언필요
		 * 10+20은 상수끼리의 연산
		*/
		
		//long의 최대값
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE+1);
		
		BigInteger c = new BigInteger("100000000000000000000000");
		BigInteger d = new BigInteger("1");
		BigInteger e = c.add(d);
		System.out.println(e.toString());
	}

}
