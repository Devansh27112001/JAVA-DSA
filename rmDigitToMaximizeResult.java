import java.math.BigDecimal;

/* Remove Digit From Number to Maximize Result:
* You are given a string number representing a positive integer and a character digit.
* Return the resulting string after removing exactly one occurrence of digit from number such that the value of
* the resulting string in decimal form is maximized. The test cases are generated such that digit occurs at least
* once in number.
*/
public class rmDigitToMaximizeResult {

    static String solution_optimal(String num,char digit){
        BigDecimal result = BigDecimal.ZERO;
        for(int i = 0; i < num.length();i++){
            if(num.charAt(i) == digit){
                String tmp =  num.substring(0,i) +  num.substring(i+1);
                if(result.compareTo(BigDecimal.valueOf(Long.parseLong(tmp)))<0){
                    result = BigDecimal.valueOf(Long.parseLong(tmp));
                }
            }
        }
        return String.valueOf(result);
    }

    static String solution_optimal_2(String num,char digit){
        String result = "";
        for(int i = 0; i < num.length() ; i++){
            if(num.charAt(i) == digit){
                String tmp = num.substring(0,i) + num.substring(i+1);
                if(tmp.compareTo(result) > 0){
                    result = tmp;
                }
            }
        }
        return result;
    }
    static String solution_optimal_3(String num,char digit){
        String result = "";
        for(int i = 0; i < num.length() ; i++){
            if(num.charAt(i) == digit){
                String tmp = num.substring(0,i) + num.substring(i+1);
                if(tmp.compareTo(result) > 0){
                    result = tmp;
                }
            }
        }
        return result;
    }
    static void main() {
        System.out.println(solution_optimal("1231",'1'));
    }
}
