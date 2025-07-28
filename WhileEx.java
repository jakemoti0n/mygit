package javalab.ch04;

// class 명을 변경할 경우 STS기능을 이용한다.(refactor-rename)
public class WhileEx {

	public static void main(String[] args) {
		// 1~10의 정수의 총합을 구하여 출력하세요.
		int num = 1;
		int sum = 0;
		
//		블록내 코드가 실행된 다는 것을 보장할 수가없다(조건을 먼저검사)
		while(num <= 10) {
			sum += num; // sum = sum+ num
			++num; // num = num +1;
//			객체 지향이기 때문에 알고리즘을 짜야함
		}
		System.out.println("1~10까지의 총합은" + sum + "입니다");
		
//		조건을 나중에 검사하면 블록내 코드가 적어도 1번 실행되는걸 보장.
		num = 1;
		sum = 0;
		do {
			sum += num;
			num++;
		} while (num <= 10);
		System.out.println("1~10까지의 총합은" + sum + "입니다");

	}

}
