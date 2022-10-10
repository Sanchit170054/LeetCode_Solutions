class Solution {
    public int mySqrt(int x) {
        if( x <= 1)
        {
            return x;
        }
        
        return findSqrt(x);
    }
    
    static int findSqrt(int x)
    {
        int l = 1, r = x/2, mid = 0, result = 0;
        long number = 0;
        
        while(l <= r)
        {
            mid = l+(r-l)/2;
            number = (long)mid*(long)mid;
            
            if(number == x)
            {
                return mid;
            }
            
            if(number < x)
            {
                result = mid;
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return result;
    }
}