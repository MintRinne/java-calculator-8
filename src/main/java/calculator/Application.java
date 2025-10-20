package calculator;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // 사용자 입력을 받는다.
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String strInput = Console.readLine();

        //stringCalculator의 결과를 출력한다.
        try {
            int intResult = StringCalculator.add(strInput);
            System.out.println("결과 : " + intResult);
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 입력입니다." + e.getMessage());
        }
    }
}
