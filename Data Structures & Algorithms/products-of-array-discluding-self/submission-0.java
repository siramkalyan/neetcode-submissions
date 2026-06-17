class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int zeroIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                count++;
                zeroIndex = i;
            }
        }
        int[] res = new int[nums.length];
        if(count > 1){
             Arrays.fill(res, 0);
             return res;
        }
        if(count == 1){
            Arrays.fill(res,0);
            int temp = 1;
            for(int num : nums) {
                    if(num != 0){
                        temp = temp * num;
                    }
            }
            res[zeroIndex] = temp;
        return res;
        }

        int product = 1;
        for(int n : nums){
            product = product * n;
        }

        for(int i =0; i < nums.length; i++){
            res[i] = product / nums[i];
        }
        return res;
    }
}  
