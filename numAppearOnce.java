public class numAppearOnce {

    static int solution_brute(int[] nums){
        for(int i = 0; i < nums.length;i++){
            boolean flag = true;
            for(int j = 0; j < nums.length;j++){
                if(i == j) continue;
                else{
                    if(nums[i] == nums[j]){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                return nums[i];
            }
        }
        return 0;
    }

    static int solution_optimal(int[] nums){
        int result = 0;
        for(int num:nums){
            result ^= num;
        }
        return result;
    }
    static void main() {
        System.out.println(solution_optimal(new int[]{4,1,2,1,2}));
    }
}
