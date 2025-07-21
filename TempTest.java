package javalab.basic;

public class TempTest {

	public static void main(String[] args) {
		// 1~10의 정수의 총합을 구하여 출력하세요.
		int num = 1;
		int sum = 0;
		
		while (num <11) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		
		num=1;
		sum=0;
		do {
			sum += num;
			num++;
		} while( num>11);
			System.out.println(sum);

	}

}
