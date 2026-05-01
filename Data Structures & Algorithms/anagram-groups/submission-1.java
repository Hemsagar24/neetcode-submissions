class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for (String s : strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String str = new String(sorted);
            if (map.containsKey(str)) {
                map.get(str).add(s);
            } else {
                List<String> list = new ArrayList();
                list.add(s);
                map.put(str, list);
            }
            // map.computeIfAbsent(str, k -> new ArrayList()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
