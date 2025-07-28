package javalab.ch04;

import java.util.stream.IntStream;

public class ForEX {

	public static void main(String[] args) {
		
		//1~10의 합구하기
		int sum = 0;
		
		for(int i = 0; i < 11; i++) {
			//for문의 초기화부분에서 선언된 변수는 for{지역변수}이다
			//sum은 for 블럭 외부에서 사용되기 떄문에 전역변수로 선언!
			sum += i;
			System.out.println("i:" +i +",sum:" +sum);
		}
		System.out.println("1~10까지의 합은" + sum + "입니다.");
		
		// 정수 구구단 출력해줘/
		int dan;
		int time;
		
		for (dan = 2; dan <=9; dan++) {
			for (time = 1; time <=9; time++) {
					System.out.println(dan +"x"+ time + "=" + (dan*time));
			}
			}
		
		
		// 1~100까지 숫자 중 홀수의합
		// 1. 홀수 인지 검사하여 처리하세요.
		// 2. 짝수 인지 검사하여 처리하세요.
		int total = 0;
		int num;
		
		for (num =1; num <= 100; num++) {
			if(num %2 == 0)// 내가오류낸것 여기서 ; 세미콜론은 일을 끝내라 라는뜻이라 쓰면안됨
				continue; //if문 여기선 if(num %2 == 0) 생략
			total += num;
		}
		System.out.println("1~100합은"+ total +"입니다");
		
		total = 0;
		for (num =1; num <= 100; num++) {
			if(num %2 == 1)// 여기서 ; 세미콜론은 일을 끝내라 라는뜻이라 쓰면안됨
				continue; // (if)이하의 모든 코드를 실행하지 않고 반복진행
			total += num;
		}
		System.out.println("1~100합은"+ total +"입니다");
		
		// 0부터 시작하여 1씩 증가하여 더한 숫자의 합이 100이상 되는 경우
		// 수와 합을 출력하시오
		// 1. for문
		// 2. while문
		int sum1 = 0;
		int num1;
		for(num1 = 0; ; num1++) {
			sum1 += num1;
			if(sum1 >= 100)
				break;
		}
		System.out.println("num1 :"+ num1 + ", sum1 :" + sum1);

		sum1 = 0;
		num = 0;
		while(sum1 <= 100) {
			++num;
			sum1 += num;
		}
		// 문제를 해결하는 두가지 방법 절차지향적, 향수지향적
		System.out.println("num1 :"+ num1 + ", sum1 :" + sum1);
		// 절차 지향적 - 변수의 상태를 변화시키면서 알고리즘을 통해 값을 더함

		System.out.println(IntStream.range(1, 11).sum()); // 함수지향
	}
}

