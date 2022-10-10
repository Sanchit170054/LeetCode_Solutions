class Solution {
    public boolean isHappy(int n) {
        
        if(n == 1)
        {
            return true;
        }
        if(n < 4)
        {
            return false;
        }
        
         Set<Integer> set = new HashSet<Integer>();
        int sum = 0;
        int number = n;
        int n1 = sum;
        while(set.add(number))
        {
            while(number > 0)
            {
                sum = sum + ((number%10)*(number%10));
                number = number/10;
            }
            System.out.println(sum);
            if(sum == 1)
            {
                return true;
            }
            // n1 = sum; 
            number= sum;
            sum = 0;
            
        }
        return false;
       
    }
}