class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        
            int a = 0;
            int max = 0;

            for (int b = 0; b<nums.length; b++)
            {
                while(nums[b] - nums[a] > 1)
                {
                    a++;
                }
                
                if (nums[b] - nums[a] == 1)
                {
                    max = Math.max(max, b - a + 1);
                }
            }
       return max; 
    }
}