class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1, j = n-1, last = m+n-1;
        
        
        while(i >= 0 && j >=0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[last] = nums1[i];
                last = last-1; i = i-1;
            }
            else
            {
                nums1[last] = nums2[j];
                last = last-1; j = j-1;
            }
        }
        
        while(j >= 0)
        {
            nums1[last] = nums2[j];
            last = last-1; j = j-1;
        }
    }
}