
# Code

```

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], ans = nums[0];
        int n = nums.length;

        for(int i =1; i<n; i++){

            // Swapping max and min if nums[i] value is negative.
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            ans = Math.max(ans, max);

        }

        return ans;
    }
}

```


# Steps

1. Set max, min and ans as the first element of array.
2. If value of nums[i] is negative, swap the max and min.
3. `max = Math.max(nums[i], max * nums[i]);` means store the maximum value of current index value which is nums[i] and prev max * nums[i] value.
4. `min = Math.min(nums[i], min * nums[i]);` means store the minimum value of current index value which is nums[i] and prev min * nums[i] value.
5. In the end just return the value of maximum.
6. Reference - [Link](https://www.youtube.com/watch?v=tHNsZHXnYd4&ab_channel=Yogesh%26Shailesh%28CodeLibrary%29)