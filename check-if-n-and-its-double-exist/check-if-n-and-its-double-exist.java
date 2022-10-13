
import java.io.*; 
import java.util.*; 
  
class Solution {
    public boolean checkIfExist(int[] arr) {
        Hashtable<Integer, Integer> ht = new Hashtable<>(); 
        if(arr.length <= 1)
        {
            return false;
        }
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 2 == 0)
            {
                if(ht.contains(arr[i]/2))
                {
                    return true;
                }
            }
            
            if(ht.contains(2*arr[i]))
            {
                return true;
            }
            else
            {
                ht.put(arr[i], arr[i]);
            }
        }
        return false;
        
    }
}