import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  
  // Time complexity = O(n^2)
  public static int[] solutionBruteForce(int[] nums, int target){
    for(int i = 0 ;i< nums.length;i++){
      for(int j = i+1;j<nums.length;j++){
        if(nums[i] + nums[j] == target){
          return new int[]{i,j};
        }
      }
    }
    return new int[]{-1,-1};
  }

  // Time complexity = O(n)
  // Space complexity = O(n)
  public static int[] solutionOptimal(int[] nums, int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0 ; i < nums.length;i++){
      int diff = target - nums[i];
      if(map.containsKey(diff)){
          return new int[]{map.get(diff) + 1, i+1};
      }
      else{
        map.put(nums[i],i);
      }
    }
    
    return new int[]{-1, -1};
  }
  public static void main(String[] args) {
    int[] result_1 = solutionBruteForce(new int[]{2,7,11,15},9);
    int[] result_2 = solutionOptimal(new int[]{2,7,11,15},9);
    System.out.println("Brute-Force: " + Arrays.toString(result_1));
    System.out.println("Optimal-Force: " + Arrays.toString(result_2));
  }
}
