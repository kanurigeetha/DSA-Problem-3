class Solution 
{
    public int minimumSum(int num) 
    {
                    //1. Initialize an array for sorting purpose.
        int[] arr = new int[4];
        int i=0;
                    //2. One by one extract the digits from the number.
        while(num>0)
        {
            int a = num%10;
            num = num/10;
            arr[i++] = a;
        }
                    //3. Sort the array.
        Arrays.sort(arr);
                    //4. Match the 0th index digit with 2nd index digit and 1st with 3rd.
        int v1 = arr[0]*10 + arr[2];
        int v2 = arr[1]*10 + arr[3];
                    //5. Final sum will be minimum.
        return v1+v2;
    }
}