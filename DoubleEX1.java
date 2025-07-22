package javalab.ch02;

import java.math.BigDecimal;
// 확장기능인 빅데시말 가져오기

public class DoubleEX1 {

	public static void main(String[] args) {
		
		double dnum = 3.14;
		float fnum = 3.14F;
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		// 부동소수점 오류
		double dNum = 0.1 + 0.1 + 0.1;
		System.out.println(dNum);
		/* 출력값 >>> 0.30000000000000004
		 * 소수점대 4라는 숫자가 데이터가 커지면 0.대에 영향을줌
		 * 진법 차이때문임(10->2진법 변환시 생기는 오류) */
		
		BigDecimal bdNum = new BigDecimal("0.1");
	    var bdNum1 = new BigDecimal("0.1"); // 자료형 추론
		// 자동화 적용하지 않고 "문자열"로 만들어라
		BigDecimal result = bdNum.add(bdNum).add(bdNum);	
		System.out.println(result);
	}

}
