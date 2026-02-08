import java.util.Arrays;

public class squaresSortedArray {
  
  private static String solution(int[] nums){
    int[] intArray = Arrays.stream(nums)
                        .map((x) -> x * x)
                        .sorted()
                        .toArray();
    return Arrays.toString(intArray);
  }

  private static String solution2(int[] nums){
    int[] tmpArray = new int[nums.length];
    int left = 0;
    int right = nums.length - 1;
    for(int i = nums.length - 1; i >= 0; i--){
      if(Math.abs(nums[left]) > Math.abs(nums[right])){
        tmpArray[i] = nums[left] *  nums[left];
        left++;
      }
      else{
        tmpArray[i] = nums[right] * nums[right];
        right--;
      }
    }
    return Arrays.toString(tmpArray);
  }
  public static void main(String[] args) {
    
    System.out.println(solution(new int[]{-4,0,6,-8}));
    System.out.println(solution2(new int[]{-4,0,6,-8}));
  }
}
