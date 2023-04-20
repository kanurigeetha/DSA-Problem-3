class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[101];

        for(int i = 0; i < nums.length; ++i)
            count[nums[i]]++;

        int sum = 0;

        for(int i = 0; i < 101; ++i) {
            sum += count[i];
            count[i] = sum;
        } 

        for(int i = 0; i < nums.length; ++i) {
            if(nums[i] == 0)
                nums[i] = 0;
            else
                nums[i] = count[nums[i] - 1];
        }

        return nums;
    }
}