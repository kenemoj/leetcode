class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        HashSet<Character> subString = new HashSet<>();

        while (j < s.length())
        {
            if(!subString.contains(s.charAt(j)))
            {
                subString.add(s.charAt(j));
                j++;
                max = Math.max(subString.size(), max);
            }
            else
            {
                subString.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}