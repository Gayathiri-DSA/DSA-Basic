/*
Smallest Divisor
Difficulty: Medium Accuracy: 50.74% Submissions: 11K+ Points: 4 Average Time: 30m
You are given an array of integers arr and an integer k, your task is to find the smallest positive integer divisor, such that upon dividing all the elements of the given array by it, the sum of the division's result is less than or equal to the given integer k.
Note: Each result of the division is rounded to the nearest integer greater than or equal to that element. For Example: 7/3 = 3.
Problem Link : https://www.geeksforgeeks.org/problems/smallest-divisor/1
*/
class Solution 
{
    public static int sumOfDivisor(int[] arr ,int div)
    {
        int sum = 0;
         // iterate thru arr
         for(int i = 0; i< arr.length ; i++)
         {
           sum += Math.ceil ((double) arr[i] / (double) div);  
         }
         return sum;
    }
    int smallestDivisor(int[] arr, int k) 
    {
        
        //Edge Case : size of arr > threshold  
        if(arr.length > k) return -1;
        
        //To determine range
        //Find the maximum element:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        
        int low = 1 , high = maxi;
        //Boundary check 
        while(low <= high)
        {
            //Find mid
            int mid = (low + high) / 2;
            // SOD <  threshold find next smallest divisor by trim search space
            if (sumOfDivisor(arr, mid) <= k) 
            {
                //Trim search space 
                high = mid - 1;
            } else 
            {
                low = mid + 1;
            }
        }
        //Low return ans using the concept of opposite polarity 
        return low;
        }
    }
