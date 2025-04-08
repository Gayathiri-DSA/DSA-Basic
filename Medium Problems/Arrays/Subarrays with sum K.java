/*
Subarrays with sum K
Difficulty: Medium Accuracy: 49.74% Submissions: 72K+ Points: 4
Given an unsorted array of integers, find the number of subarrays having sum exactly equal to a given number k.
Problem Link : https://www.geeksforgeeks.org/problems/subarrays-with-sum-k/1
*/

class Solution 
{
    public int countSubarrays(int arr[], int k) 
    {
        //Approach : Using Prefix sum--> gives complete sum of subarray ; k-->given ; remaining portion: prefixsum - k
        
         int n = arr.length; // size of the given array.
         //Using Map Data Structure to store count 
        Map<Integer,Integer> mpp = new HashMap<>();
        
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        
        
        for (int i = 0; i < n; i++) 
        {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - k;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}
