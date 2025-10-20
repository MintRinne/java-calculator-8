package calculator;

public class StringCalculator {

    public static int add(String strInput) {
        //빈문자열 || null 입력시 0 반환
        if (isBlank(strInput)) {
            return 0;
        }

        //입력 문자열을 구분자 기준으로 분리
        String[] numbers = StringParser.split(strInput);

        int sum = 0;
        for(String number : numbers) {
            //문자열을 숫자로 변환하고, 유효성 검사
            int pared = toPositiveInt(number);
            sum += pared;
        }
        return sum;
    }

    //null || 빈 문자열 확인
    public static boolean isBlank(String strInput) {
        return strInput == null || strInput.isEmpty();
    }
    private static int toPositiveInt(String number) {
        //예외 처리
        try {
            int value = Integer.parseInt(number);

            // 음수 입력 시
            if (value < 0) {
                throw new IllegalArgumentException("음수는 입력이 불가합니다: " + value);
            }

            return value;
        } catch (NumberFormatException e) {
            // 숫자로 변환할 수 없는 경우
            throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다: " + number);
        }
    }
}