package javalab.ch02;


// 형식 변환
public class TypeConversion {

	public static void main(String[] args) {
		int iNum = 1000;
		byte bNum = (byte)iNum; // 명시적 형변환 int가 byte보다 큼
		
		System.out.println(iNum);
		System.out.println(bNum);
		/*출력결과가 -24가 나오는이유는 byte 최대값이 256을 초과하여
		overflow 현상발생 */
		
		double dNum = 3.14;
		int iNum2 = (int)dNum; // 명시적 형변환 - double > int 
		
		System.out.println(dNum);
		System.out.println(iNum2);
		
		//1.2와 0.9F를 더한 값을 정수로 출력하세요
		double dNum1 = 1.2;
		float fNum1 = 0.9F;
		
		int iNum3 = (int)dNum1 + (int)fNum1; // 오 류 
					//int 형변환시 소수점은 '버림'처리
		int iNum4 = (int)(dNum1 + fNum1); // 정 답
		
//		double iNum3 = (int)iNum3
//		double fNum1 = (double)fNum1; 틀렷음
//		int iNum3 = dNum1.add(fNum1); 틀렸음
				
				System.out.println(iNum3);
		System.out.println(iNum4);

// 묵시적
		byte bNum01 = 10;
		int iNum01 = bNum01;
		
		System.out.println(bNum01);
		System.out.println(iNum01);
		
		int iNum02 = 20;
		float fNum01 = iNum02;
		
		System.out.println(iNum02);
		System.out.println(fNum01);
		
		double dNum02; // 기본형 변수인 경우 사용전 초기화(값대입)필수!
		dNum02 = fNum01 + iNum02; 
		// dnum02에 fNum01과 iNum02의 더한값을 대입
		System.out.println(dNum02);
		
	}

}
