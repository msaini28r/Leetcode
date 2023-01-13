
# Code

```

 class Solution {
    public boolean canPartition(int[] nums) {
       int total = 0;
       for(int i : nums) total += i;
       if(total % 2 != 0) return false;
       int max = total / 2;
       int[][] results = new int[nums.length][max];
       return isPartition(max, 0, 0, nums, results);
    }

    public boolean isPartition(int max, int index, int sum, int[] nums, int[][] results){
        if(sum > max || index > nums.length-1) return false;
        if(sum == max) return true;
        if(results[index][sum] == 1) return true;
        if(results[index][sum] == 2) return false;
        boolean res = isPartition(max, index + 1, sum + nums[index], nums, results) || isPartition(max, index + 1, sum, nums, results);
        results[index][sum] = res ? 1 : 2;
        return res;
    }
}

```


# Steps

1.  Consider a total = 0; and add all the nums of i in it.
2.  If total is not divided by 2 and does not give answer as 0, simply return false;
3.  `int max = total / 2;` means max is half of total.
4.  After that we will create a 2D matrix to store index and max, so that we have to find half only once. here we are using Dp. DP is basically doing something once and storing it.
5.  In isPartition function we are taking the first condition as if sum becomes greater than max or value of index crosses the end of array.
6.  Second condition is if sum == max then simply return true.
7.  `
if(results[index][sum] == 1) return true;
        if(results[index][sum] == 2) return false;
` , here we are checking if we already computed teh result for the index i with the sum current, we retrieve this result (1 for true and 2 for false).
8. In `boolean res` we are checking either we want to consider taking the nums[index] in sum or not while we move  forward.