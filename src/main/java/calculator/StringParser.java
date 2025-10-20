package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    //기본 구분자 쉼표, 콜론
    public static final String strDelimiters = ",|:";

    public static String[] split(String strInput){

    //커스텀 구분자 패턴 추가
            Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher((strInput));

    //커스텀 구분자가 있는 경우
            if(matcher.matches()){
                String strCustom = matcher.group(1);
                String strNum = matcher.group(2);

                return strNum.split(strCustom);
            }

        //기본 기분자
        return strInput.split(strDelimiters);
    }

}
