import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ar[] = new int[2];
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        for(int i = 0; i < nums.length; i++)
        {
            int value = target-nums[i];
            if(ht.containsKey(value))
            {
                ar[0] = i;
                ar[1] = ht.get(value);
                break;
            }
            else
            {
                ht.put(nums[i],i);
            }
        }
        
        return ar;
    }
}