/*
Maximum Product Subarray
Difficulty: Medium Accuracy: 18.09% Submissions: 444K+ Points: 4
Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].
Note: It is guaranteed that the output fits in a 32-bit integer.
Problem Link : https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1
*/

class Solution 
{
    // Function to find maximum product subarray
    int maxProduct(int[] arr)
    {
        
        int n = arr.length; //size of array.
        // Traverse from front (Prefix) and find max then traverse from back (Suffix) and find max 
        int pre = 1, suff = 1;
        
        //Store min value as ans
        int ans = Integer.MIN_VALUE;
        
        //Iterate thru array
        for (int i = 0; i < n; i++) 
        {
            // If encountered zero it is a start of new sub array as * any max product leaves 0 so update 0 = 1
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            
            pre *= arr[i];
            suff *= arr[n - i - 1];
            
            //Select the maximum product from prefx and suffix
            ans = Math.max(ans, Math.max(pre, suff));
        }
        //Return final answer
        return ans;
    

    }
}
