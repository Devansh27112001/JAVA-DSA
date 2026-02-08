import java.util.Arrays;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the
// elements of nums except nums[i].
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//You must write an algorithm that runs in O(n) time and without using the division operation.
public class ProductExceptSelf {

    static int[] solutionBrute(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int product = 1;
            for(int j = 0; j < nums.length; j++){
                if(i != j){
                    product *= nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }

    static int[] solution_better(int[] nums){
        int[] result = new int[nums.length];
        int product = 1;
        for(int i = 0; i < nums.length; i++){
            product *= nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            result[i] = product / nums[i];
        }
        return result;
    }
    static void main() {
        System.out.println(Arrays.toString(solutionBrute(new int[]{1,2,3,4})));
        System.out.println(Arrays.toString(solution_better(new int[]{1,2,3,4})));
    }
}
