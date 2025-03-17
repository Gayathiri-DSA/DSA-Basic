/*
Second Largest
Difficulty: Easy Accuracy: 26.72% Submissions: 1.1M Points: 2 Average Time: 15m
Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
Note: The second largest element should not be equal to the largest element.
problem link :https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
*/

class Solution {
    public int getSecondLargest(int[] arr) {

        //intializing highest and sech with  min value
        int highest = Integer.MIN_VALUE;
        int secondhighest=Integer.MIN_VALUE;
        
        if(arr.length < 2) //base case:  in order to fnd 2nd max there should be atleast 3 ele in arr
        {
            return -1;
        }
        
        //Iterate thru arr to get two largest distinct elements
        for(int i=0 ; i<arr.length ; i++)
        {
        
        if(arr[i] > highest)
        {
            //update both highest & second high as we iterate thru arr
            secondhighest= highest;
            highest =arr[i];
        }
        
        //if(arr[i] < highest && arr[i] > secondhighest)
        else if(arr[i] > secondhighest && arr[i]!=highest)
        {
            //update second highest only if current ele is btw highest & secondhighest
            secondhighest = arr[i];
        }
        }
        // if second highest == int.minval,return -1 (no second largest found)
        return secondhighest == Integer.MIN_VALUE ? -1 : secondhighest;
    }
}
