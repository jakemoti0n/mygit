package javalab.ch03;

public class OperatorEx {

	public static void main(String[] args) {
		// 증가/감소 연산자
		// 값을 1씩 증가, 감소시키는 연산자
		int num = 0;
		
		System.out.println(++num); // num = num + 1, 1을 더한후 num을 출력
		System.out.println(num++); // num = num + 1, num을 출력후 1 더함
		System.out.println(num);
		
		System.out.println(--num); // num = num + 1, 1을 뺀후 num을 출력
		System.out.println(num--); // num = num + 1, num을 뺀후 1 더함
		System.out.println(num);
		
		
//		단락회로
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
		value = ((num1 = num1 + 10)> 10) || ((i = i + 2) >10);
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);
		
//		복합대입연산자
		num1 += 2; // num1 = num1 + 2;
//		+*/% 사칙연산과 동일
		System.out.println(num1);
		
//		삼항연산자=조건연산자
		int fatherAge = 45;
		int motherAge = 47;
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
		
//		실습, 나눗셈, 분모 a변수에0을 입력할 경우 계산을 안한다
		int a = 0, b = 3;
		int result = 0;
		
		if(a !=0) {
			result = b/a;
		}
		boolean isChech = (a != 0) && ((result = b/a) >= 0);
		
		result = (a != 0) ? b/a : a;
		System.out.println(result);
	}

}
