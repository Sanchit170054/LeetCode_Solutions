class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        
        for(String str: sentences)
        {
            String value[] = str.split(" ");
            max = value.length > max ? value.length : max;
        }
        
        return max;
        
    }
}