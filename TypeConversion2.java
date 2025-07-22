package javalab.ch02;

public class TypeConversion2 {

	public static void main(String[] args) {
		
		int a = 1; // (1,2 이부분이 리터럴)
		int b = 2;
		System.out.println(a+b);
		
		String a1 = "1", b1 = "2"; // 문자열
		//String = class, 참조형 변수
		// 문자열(class형) : 참조형(heap) >>> 값(heap저장), 참조(주소, stack저장)
		// 숫자,문자,논리 : 기본형(stack) >>> 값(stack저장), 변수(stack저장)
				
		System.out.println(a1+b1);
		
//		int a2 = (int)a1; // a1: 참조(주소값)
		// 문자형과 정수형은 메모리 공간이 달라서 그럼
//		int b2 = (int)b1; // b1: 참조(주소값)
		// int -> Integer, double -> Double : Wrapper class
		// heap 공간에 있는 값을 stack 공간으로 가져옴 : unboxing 
		// stack -> heap : boxing
		int a2 = Integer.parseInt(a1); // a1의 주소에있는 heap공간의 값을 가져옴
		int b2 = Integer.parseInt(b1); // b1의 주소에있는 heap공간의 값을 가져옴
		
		System.out.println(a2 + b2);
		
		// boxing 해보기
		String s1 = String.valueOf(a2);
		String s2 = String.valueOf(b2);
		System.out.println(s1 + s2);
		
		//명사와 기호로만 요약(추상화, 마인드맵, 표)
	}

}

