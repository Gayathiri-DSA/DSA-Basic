/*
Two Sum - Pair with Given Sum
Difficulty: Easy Accuracy: 30.61% Submissions: 361K+ Points: 2 Average Time: 20m
Given an array arr[] of positive integers and another integer target.
Determine if there exists two distinct indices such that the sum of there elements is equals to target.
Problem Link : https://www.geeksforgeeks.org/problems/key-pair5616/1?page=1&category=Arrays&difficulty=Easy&sortBy=submissions
*/

class Solution
{
    boolean twoSum(int arr[], int target) 
    {
        //Using two pointer approach tc: o(N) + O(log N) - Sorting
        Arrays.sort(arr); 
        
         int left =0 ,right =arr.length-1;
         while(left < right)
         {
             int sum = arr[left] + arr[right];
             if(sum == target)
             {
                 return true;
             }
             else if(sum < target)
                left ++;
            else
                right--;
         }
         return false;
    }
}
