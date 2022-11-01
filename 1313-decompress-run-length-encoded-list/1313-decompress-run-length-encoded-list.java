class Solution {
    public int[] decompressRLElist(int[] nums) {
        int freq=0,val=0;
    ArrayList<Integer> a=new ArrayList<>();
    for(int i=0;i<nums.length;i=i+2)
    {
        freq=nums[i];
        val=nums[i+1];
        while(freq!=0)
        {
            a.add(val);
            freq--;
        }
    }
    int arr[]=new int[a.size()];
    for(int i=0;i<a.size();i++)
    {
        arr[i]=a.get(i);
    }
    return arr;
    }
}