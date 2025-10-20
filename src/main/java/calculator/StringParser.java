package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser {

    //기본 구분자 쉼표, 콜론
    public static final String strDelimiters = ",|:";

    public static String[] split(String strInput){

        //기본 기분자
        return strInput.split(strDelimiters);
    }

}
