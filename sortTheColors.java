import java.util.Arrays;
import java.util.HashSet;

public class sortTheColors {

    private static int[] solutionBrute(int[] nums){
        HashSet<Integer>  set = new HashSet<>();
        return Arrays.stream(nums)
                                .sorted().toArray();
    }

    private static int[] solutionBetter(int[] nums){
        int[] result = new int[nums.length];
        int[] count = new int[3];
        for (int num : nums) {
            if (num == 0) {
                count[0]++;
            } else if (num == 1) {
                count[1]++;
            } else {
                count[2]++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(count[0] > 0){
                result[i] = 0;
                count[0]--;
            }
            else if(count[1] > 0){
                result[i] = 1;
                count[1]--;
            }
            else{
                result[i] = 2;
                count[2]--;
            }
        }
        return result;
    }

    private static int[] solutionOptimal(int[] nums){
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high){
            if(nums[mid] == 0){
                int tmp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = tmp;
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                int tmp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = tmp;
                high--;
            }
            else{
                mid++;
            }
        }
        return nums;
    }
    static void main(String[] args) {
        System.out.println(Arrays.toString(solutionBrute(new int[]{1,1,1,0,0,0,1,1,1,1,2,1,2})));
        System.out.println(Arrays.toString(solutionBetter(new int[]{1,1,1,0,0,0,1,1,1,1,1,2,1,2})));
        System.out.println(Arrays.toString(solutionOptimal(new int[]{1,1,1,0,0,0,1,1,1,1,1,2,1,2})));
    }
}
