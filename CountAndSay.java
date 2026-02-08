public class CountAndSay {

  private static String convertToStr(String num){
    int count = 0;
    StringBuilder sb = new StringBuilder();
    for(int i = 0; i< num.length();i++){
      count++;
      if(i == num.length() -1 || num.charAt(i) != num.charAt(i+1)){
        sb.append(count);
        sb.append(num.charAt(i));
        count = 0;
      }
    }
    return sb.toString();
  }
  public static String countAndSay(int n) {
    if(n == 1) return "1";  
    String finalResult = "1";
    for(int i = 2; i <= n;i++){
      finalResult = convertToStr(finalResult);
    }
    return finalResult;
  }
  public static void main(String[] args) {
    System.out.println(countAndSay(4));
  }
}
