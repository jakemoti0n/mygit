package javalab.ch04;

public class SwitchEx1 {
    public static void main(String[] args) {
        int ranking = 1;
        String medalColor;

        if (ranking == 1) {
            medalColor = "G";
        } else if (ranking == 2) {
            medalColor = "S";
        } else if (ranking == 3) {
            medalColor = "B";
        } else {
            medalColor = "A";
        }
        System.out.println(ranking + "의 메달은 " + medalColor + "입니다");

        ranking = 2;
        switch (ranking) {
            case 1:
                medalColor = "G";
                break;
            case 2:
                medalColor = "S";
                break;
            case 3:
                medalColor = "B";
                break;
            default:
                medalColor = "A";
        }
        System.out.println(ranking + "의 메달은 " + medalColor + "입니다");
// 표현식
        String[] medals = {"", "G", "S", "B", "A"};
        System.out.println(medals[1]);
        System.out.println(medals[ranking]);
        System.out.println(medals[(ranking > 3)?4:ranking]);
        
 // 표현식       
        String medal = "Gold";
        switch (medal) {
            case "Gold" -> System.out.println("금메달입니다");
            case "Silver" -> System.out.println("은메달입니다");
            case "Bronze" -> System.out.println("동메달입니다");
            default -> System.out.println("참가상입니다");
        }


        
        // 표현식
        String message = switch (medal) {
            case "Gold" -> "금메달입니다";
            case "Silver" -> "은메달입니다";
            case "Bronze" -> "동메달입니다";
            default -> "참가상입니다";
        };
        System.out.println(message);

        int month = 7;// 변수를 7로 초기화 하겠다
        int day = switch (month) { // day값에 switch(month)의결과를 담겠다
            case 2 -> 28; //  28 선언
            case 4, 6, 9, 11 -> 30;
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            default -> {
                if (month < 1 || month > 12) {
                    System.out.println("잘못된 월입니다");
                } 
                else {
                    System.out.println("알 수 없는 오류입니다");
                }
                yield 0;
            } // --default
        };
        System.out.println(month + "월의 날짜는 " + day + "일까지 있습니다");
        
    }
}