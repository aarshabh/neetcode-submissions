class Solution {
    public int lengthOfLongestSubstring(String s) {
        String res = "";
        char[] sub = s.toCharArray();
        StringBuilder temp = new StringBuilder();
        for (char c : sub) {
            int index = temp.indexOf(String.valueOf(c));
            if (index != -1) {
                temp.delete(0, index + 1);
            } 
            temp.append(c);
            if (temp.length() > res.length()){
                res = temp.toString();
            }
        }
        return res.length();
    }
}
