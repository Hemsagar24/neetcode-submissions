class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap();
        for(String s: strs){
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String str = new String(sorted);
            // if(map.containsKey(s)){
            //     map.get(s).add(key)
            // }else{
            //     map.put(s)
            // }
            map.computeIfAbsent(str, k -> new ArrayList()).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
