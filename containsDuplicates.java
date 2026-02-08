import java.util.HashSet;

public abstract class containsDuplicates {
  
  public static boolean solutionBruteForce(int[] nums){
    for(int i = 0;i<nums.length;i++){
      for(int j = i+1;j<nums.length;j++){
        if(nums[i] == nums[j]){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean solutionBetter(int[] nums){
    HashSet<Integer> numbers = new HashSet<>();
    for(int num:nums){
      if(numbers.contains(num)) return true;
      numbers.add(num);
    }
    return false;
  }
  public static void main(String[] args) {
    
  }
}
