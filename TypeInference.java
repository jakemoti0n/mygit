package javalab.ch02;


// 자료형 추론
/*
 * 	1.리터럴을 이용하여 추론.
 * 	2. 추론된 자료형은 변경되지 않는다.(한번만 추론)
 * 	3. 지역 변수로만 사용가능하다.(주로 메서드 블럭)
 */
public class TypeInference {
	

	public static void main(String[] args) {
		int i = 10;
		var j = 10.1; // 컴파일러에게 자료형(리터럴) 추론 요청(double)
		var str = "hello"; // 자료형 추론(String)
		
		System.out.println(i); //sysout + ctr+spc
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		// str = 1;
	
		//block 밖에 있는 변수 >>> 전역변수
		int a = 1;
		// int a = 2;
		int b = 2;
		
		{
			//block(Scope) 밖에 있는 변수 >>> 전역변수전역변수
			//이것도 지역변수지만 설명하기 위해 {}가 없다고 가정
			//a 와 b는 이미 블럭밖에 존재하니까
			a = 2;
			b = 3;
			//block 안에 존재하는 변수 >>> 지역변수
			//block(Scope)내에서만 '상태가 유지'되는 변수
			//block을 탈출 하는 순간에 메모리(스택:기본형)에서 제거됨
			//자바 스펙에 의해{}를 쓰게되니 자동적으로 지역변수 사용
			
			int c = 4;
		}
		//System.out.println(c); c는 지역변수이기 때문에 {}을 나오는순간
		//메모리에서 제거되어 사용 불가능.
		
		System.out.println(a);
		System.out.println(b);
		
		// 상수 : 값의 수정 불가!, 불변형, 대문자로 변수명 지정!
		final double PI = 3.14;
		

	}

}
