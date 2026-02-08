public class ValidPalindome {

  public static boolean isPalindrome(String word){
    StringBuilder modified = new StringBuilder();
    for(char c : word.toCharArray()){
      if(Character.isLetterOrDigit(c)){
        modified.append(Character.toLowerCase(c));
      }
    }
      String forward = modified.toString();
      String backward = modified.reverse().toString();

    return forward.equals(backward);
  }

  public static boolean isPalindromeOptimized(String word){
    int start = 0;
    int end = word.length() -1;
    StringBuilder builder = new StringBuilder(word);
    while(start < end){

      while(start < end && !Character.isLetterOrDigit(builder.charAt(start))){
        start++;
      }

      while(start < end && !Character.isLetterOrDigit(builder.charAt(end))){
        end--;
      }

      Character first = Character.toLowerCase(builder.charAt(start));
      Character last = Character.toLowerCase(builder.charAt(end));
      
      if(!first.equals(last)) return false;
      start++;
      end--; 
    }
    return true;
  }
  public static void main(String[] args) {
    System.out.println(isPalindromeOptimized("This is a cat"));
  }
}