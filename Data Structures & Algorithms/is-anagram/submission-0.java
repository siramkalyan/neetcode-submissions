class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] arr = new int[26];
        Arrays.fill(arr,0);
        for(char a : s.toCharArray()){
            int temp =  a - 'a';
            arr[temp]  = arr[temp] + 1;
        }

        for(char a : t.toCharArray()){
            int temp = a - 'a';
            arr[temp] = arr[temp]-1;
        }

        for(int i : arr){
            if(i != 0){
                return false;
            }
        }
        return true;
    }
}
