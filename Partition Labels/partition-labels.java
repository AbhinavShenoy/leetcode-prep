class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        for(int i = 0; i<s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }
        
        List<Integer> list = new ArrayList();
        
        int start = 0;
        int end = 0;
        for(int i = 0; i<s.length(); i++){
            end = Math.max(last[s.charAt(i) - 'a'], end);
            if(end == i){
                list.add(end-start+1);
                start = end + 1;
            }
                
        }
        return list;
    }
}