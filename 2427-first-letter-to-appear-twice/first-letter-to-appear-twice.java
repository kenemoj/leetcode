class Solution {
    public char repeatedCharacter(String s) {
        
        //create empty hashset
        HashSet<Character> c = new HashSet<>();
        int n = s.length();

        for(int i = 0; i < n; i++)
        {
            if(c.contains(s.charAt(i)))
            {
                return s.charAt(i);
            }
            c.add(s.charAt(i));
        }

        return ' '; 
    }
}