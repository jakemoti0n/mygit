package javalab.ch04;

public class ifExample {

	public static void main(String[] args) {
		/*나이(변수명 : age)가 8살 이상이면 "학교에 다닙니다" 그밖에 경우는
		학교에 다니지 않습니다." 라고 출력
		아이의 나이는 2살입니다*/
//		int age = 2;
//		if (age >= 8) {
//			System.out.println("학교에 다닙니다");
//		}
//		else {
//			System.out.println("학교에 다니지 않습니다");
//		}
//		
		/* 
		 * 
		 */
		
//		int age = 9; // 변수 age에 9를 넣어라
//		int charge; // 요금변수를 정수로지정
//		// age는 if문 내에서 변화가 없으니 초기화 시키고
//		// charge는 if문 내에서 계속 변화하므로 초기화x
//		
//		if(age < 8) { // 8세 미만일시
//			charge = 1000; // if문 내부에서 1000원으로 초기화(선언)
//			System.out.println("미취학 아동입니다.");
//		}
//		//지역변수라 {}가 끝나면 재지정 가능
//		else if (age < 14) { // 14세 미만일시
//			charge = 2000; // 2000원 
//			System.out.println("초등학생 입니다");
//		}
//		else if (age < 20) { // 20세 미만일시
//			charge = 2500; // 2500원
//			System.out.println("중고등학생 입니다");
//		}
//		else { // 그외에 모든경우에
//			charge = 3000; // 3000원
//					System.out.println("일반인 입니다");
//		}
//		System.out.println("입장료" + charge + "원 입니다");
//
		
		int age = 9; // 변수 age에 9를 넣어라
		int charge; // 요금변수를 정수로지정
		// age는 if문 내에서 변화가 없으니 초기화 시키고
		// charge는 if문 내에서 계속 변화하므로 초기화x
		
		if(age < 8) { // 8세 미만일시
			charge = 1000; // if문 내부에서 1000원으로 초기화(선언)
			System.out.println("미취학 아동입니다.");
		}
		//지역변수라 {}가 끝나면 재지정 가능
		if (age < 14) { // 14세 미만일시
			charge = 2000; // 2000원 
			System.out.println("초등학생 입니다");
		}
		if (age < 20) { // 20세 미만일시
			charge = 2500; // 2500원
			System.out.println("중고등학생 입니다");
		}
		else { // 그외에 모든경우에
			charge = 3000; // 3000원
					System.out.println("일반인 입니다");
		}
		System.out.println("입장료" + charge + "원 입니다");
		// 묵시적 형변환 int->스트링 됨? : 자바가 자동적으로 
		//int charge를 String "charge"으로 변경 이것도 자바의 spec임
	}

}
