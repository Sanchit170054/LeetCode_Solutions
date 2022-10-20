class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int a = 0, b = n;
        
        for(int i = 0; i < nums.length;)
        {
            result[i] = nums[a];
            ++i;
            result[i] = nums[b];
            ++i;
            a++;b++;
        }
        return result;
    }
}