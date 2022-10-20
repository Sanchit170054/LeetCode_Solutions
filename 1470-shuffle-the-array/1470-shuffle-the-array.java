class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int a = 0, b = n;
        
        for(int i = 0; i < nums.length; i++)
        {
            if(i % 2 == 0)
            {
                result[i] = nums[a];
                a++;
            }
            else
            {
                result[i] = nums[b];
                b++;
            }
        }
        return result;
    }
}