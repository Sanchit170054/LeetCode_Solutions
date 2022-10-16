import java.util.*;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++)
        {
            int item = Math.abs(nums[i])-1;
            if(nums[item] > 0)
            {
                nums[item] = -nums[item];
            }
        }
        
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > 0)
            {
                list.add(i+1);
            }
        }
        return list;
    }
}