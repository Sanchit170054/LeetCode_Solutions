class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int result = 0;
        for(int i: nums)
        {
            int count = hm.getOrDefault(i, 0);
            result+= count;
            hm.put(i, count+1);
            
        }
      return result;
    }
    
}