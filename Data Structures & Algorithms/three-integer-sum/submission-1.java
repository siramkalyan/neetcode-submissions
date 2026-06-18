class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if (i >0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int j = nums.length - 1;
            while(l < j){
                int temp = nums[i] + nums[l] + nums[j];
                if(temp == 0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[j]));
                    l++;
                    j--;
                    while(l < j & nums[l] == nums[l-1]){
                        l++;
                    }
                }
                else if(temp > 0){
                    j--;
                }
                else{
                    l++;
                }
            }

        }
        return result;
    }
}
