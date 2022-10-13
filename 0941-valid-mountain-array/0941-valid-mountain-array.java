class Solution {
    public boolean validMountainArray(int[] arr) {
        
       if(arr.length < 3) 
           return false;
        
        int flag = 0;
        
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] < arr[i+1])
                flag+= 1;
        }
        
        if(flag == 0 || flag == arr.length -1)
        {
            return false;
        }
        
       System.out.println(flag);
        
        for(int i = flag; i < arr.length-1; i++)
        {
            if(arr[i] > arr[i+1])
            {
                flag+= 1;
                 // System.out.println(flag);
            }                
        }
        
        if(flag == (arr.length-1))
            return true;
        
        return false;
    }
}