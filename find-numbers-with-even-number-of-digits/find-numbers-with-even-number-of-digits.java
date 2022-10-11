class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums)
        {
            int even_count = 0;
            int item = i;
            while(item > 0)
            {
                item = item / 10;
                even_count+=1;
            }
            count = even_count % 2 == 0 ? (count+1) : count;
        }
        return count;
    }
}