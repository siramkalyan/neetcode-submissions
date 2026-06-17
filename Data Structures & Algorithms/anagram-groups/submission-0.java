class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for(String str: strs){
            char[] temp1 = str.toCharArray();
            Arrays.sort(temp1);
            String temp = new String(temp1);

            if(map.containsKey(temp)){
                List<String> temp2 =  map.get(temp);
                temp2.add(str);
                map.put(temp, temp2);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(str);
                map.put(temp, l);
            }
        }
        List<List<String>> result  = new ArrayList<>();
        for(String key : map.keySet()){
            result.add(map.get(key));
        }
        return result;
    }
}
