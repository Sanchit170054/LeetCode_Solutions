class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        
        if(heights.length < 1)
        {
            return count;
        }
        
        int sortAr[] = new int[heights.length];
        
        for(int i = 0 ;i < heights.length; i++)
        {
            sortAr[i] = heights[i];
        }
        
        Arrays.sort(sortAr);
        
        for(int i = 0; i < heights.length; i++)
        {
            if(sortAr[i]!=heights[i])
            {
                count+=1;
            }
        }
        
        return count;
    }
}