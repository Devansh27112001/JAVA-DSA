import java.util.ArrayList;
import java.util.List;

public class summaryRanges {

  private static List<String> solution(int[] nums) {
    List<String> result = new ArrayList<>();
    if(nums.length == 0) return result;
    int start = nums[0];
    int end = nums[0];

    for(int i = 1; i < nums.length;i++){
      if(nums[i] - 1 == end){
        end = nums[i];
      }
      else{
        if(start == end){
          result.add(String.valueOf(start));
        }
        else{
          result.add(start + "->" + end);
        }
        start = nums[i];
        end = nums[i];
      }
    }
    if(start == end){
          result.add(String.valueOf(start));
        }
        else{
          result.add(start + "->" + end);
        }
    // Implementation goes here
    return result;
  }
  
  public static void main(String[] args) {
    System.out.println(solution(new int[]{0,1,2,4,5,8,9}));
  }
}
