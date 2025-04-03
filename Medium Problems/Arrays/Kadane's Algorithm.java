/*
Kadane's Algorithm
Difficulty: Medium Accuracy: 36.28% Submissions: 1.1M Points: 4 Average Time: 20m
Given an integer array arr[]. You need to find the maximum sum of a subarray.
Problem Link : https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions
*/
class Solution {
    int maxSubarraySum(int[] arr) {
        // Initializing Variable
        int max = Integer.MIN_VALUE , sum = 0,start=0;
        int ansStart =-1,ansEnd =-1;
        
        for(int i=0;i<arr.length;i++)
        {
            sum = sum +arr[i]; // add cur ele to sum
            
            //when sum becomes 0 it always start as new subarray keep start to that ele i
            if(sum==0) 
            {
                start=i;
            }
            //sum > max update sum to max  
            if(sum > max)
            { 
                max = sum;
                //then to print subarray start and end are stored inside var ansstart,ansend
                ansStart = start ;
                ansEnd =i;
                
            }
            // sum < 0 (i.e encountered -ve no's)
            if(sum < 0)
            {
                // update sum to 0
                sum =0;
            }
        }
        return max;
    }
}
