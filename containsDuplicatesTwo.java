// DESCRIPTION : Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

import java.util.HashMap;

public class containsDuplicatesTwo {

  public static boolean solution(int[] nums, int k){

    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length;i++){
      if(map.containsKey(nums[i])){
        if(i - map.get(nums[i]) <= k){
          return true;
        }
      }
      map.put(nums[i],i);
    }
    return false;
  }
  public static void main(String[] args) {
    System.out.println(solution(new int[]{1, 2, 3, 1}, 3));
  }
}
