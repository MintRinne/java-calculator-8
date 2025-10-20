package calculator;

public class StringCaculator {
    public static int add(String strInput) {
        //빈문자열 || null 입력시 0 반환
        if (isBlank(strInput)) {
            return 0;
        }
        return 0;
    }

    //null || 빈 문자열 확인
    public static boolean isBlank(String strInput) {
        return strInput == null || strInput.isEmpty();
    }
}