class Solution 
{
    public int[] leftRigthDifference(int[] nums) 
    {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
            left[i] = nums[i-1]+left[i-1];
        }
        for(int j=nums.length-2;j>=0;j--)
        {
            right[j] = right[j+1] + nums[j+1];
        }

        for(int k = 0;k<nums.length;k++)
        {
            right[k] = Math.abs(left[k]-right[k]);
        }
        
        return right;
    }
}