/*
Split Array Largest Sum
Difficulty: Hard Accuracy: 58.9% Submissions: 50K+ Points: 8
Given an array arr[] of N elements and a number K., split the given array into K subarrays such that the maximum subarray sum achievable out of K subarrays formed is minimum possible.
Find that possible subarray sum.
Problem Link : https://www.geeksforgeeks.org/problems/split-array-largest-sum--141634/1
*/

//Similar/ Exactly same to Book allocation and Painter Partition to 
class Solution 
{
    public static int countPartitions(int[] arr,int N, int maxSum) {
        
        int partitions = 1;
        long subarraySum = 0;
        for (int i = 0; i < N; i++) {
            if (subarraySum + arr[i] <= maxSum) {
                //insert element to current subarray
                subarraySum += arr[i];
            } else {
                //insert element to next subarray
                partitions++;
                subarraySum = arr[i];
            }
        }
        return partitions;
    }

    
        
    static int splitArray(int[] arr , int N, int K) 
    {
        int low = arr[0];
        int high = 0;
        //find maximum and summation:
        for (int i = 0; i < N; i++) 
        {
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        //Apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int partitions = countPartitions(arr,N, mid);
            if (partitions > K) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
};
