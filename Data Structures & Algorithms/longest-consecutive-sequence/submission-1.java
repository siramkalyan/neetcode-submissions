class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int result = 1;
        for(int n : nums){
            int temp = 1;
            int temp1 = n-1;
            while(set.contains(temp1)){
                temp++;
                temp1 = temp1-1;
            }
            result = Math.max(temp, result);
            set.add(n);
        }
        return result;
    }
}
