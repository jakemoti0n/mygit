package javalab.ch02;

public class CharactorEX1 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); 
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		int ch4 = 68;
		System.out.println(ch4);
		System.out.println((char)ch4);
		//여기부터
		char ch5 = '한';
		char ch6 = '\uD55C'; // 유니코드값
		System.out.println(ch5);
		System.out.println(ch6);
		//여기까지가 자연어 한문장인 셈이다
	}

}
