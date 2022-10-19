class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        int result = 0;
        for(String i: operations)
        {
            if(i.indexOf("++") != -1)
            {
                result+=1;
            }
            else if(i.indexOf("--") != -1)
            {
                result-=1;
            }
        }
        
        return result;
    }
}