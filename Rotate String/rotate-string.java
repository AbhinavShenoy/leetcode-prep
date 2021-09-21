class Solution {
    public boolean rotateString(String s, String goal) {
        String comp = s+s;
        if(s.length() == goal.length())
            return comp.contains(goal);
        else
            return false;
        
    }
}