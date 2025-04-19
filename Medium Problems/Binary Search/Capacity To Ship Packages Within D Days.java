/*
Capacity To Ship Packages Within D Days
Difficulty: Medium Accuracy: 50.14% Submissions: 24K+ Points: 4 Average Time: 25m
Given an array arr[] of n weights. Find the least weight capacity of a boat to ship all weights within d days.
The ith weight has a weight of arr[i]. Each day, we load the boat with weights given by arr[i].We may not load more weight than the maximum weight capacity of the ship.
Note: You have to load weights on the boat in the given order.
Problem Link : https://www.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
*/
class Solution 
{
    // Function to find Number of days
    public static int findDays(int[] arr, int cap)
    {
        int load = 0; // element in arr
        int days =1; // intialize day to 1
        
        // iterate thru arr
        for(int i = 0; i<arr.length ; i++)
        {
            //Condition load + weight should not exceed capacity of ship
            if(load + arr[i] > cap)
            {
                days+= 1 ; // move to next day and store weight in load for next cap
                load = arr[i];
            }
            // load + weight is @ crt capacity --load the weight on the same day.
            else
            {
              load =load+arr[i]; // update load with capacity  
            }
        }
        return days;
    }
    static int leastWeightCapacity(int[] arr, int n, int d)
    {
        // 1.Find range in this case (max --- sum of ele in arr)
        //Find the maximum and the summation:
        int low = Integer.MIN_VALUE, high = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            high += arr[i];
            low = Math.max(low, arr[i]);
        }
        //2.Apply BS
         while(low <= high)
         {
             int mid = (low + high)/2;
             int noOfDays = findDays(arr,mid);
             if( noOfDays <= d)
             {
                 high = mid -1 ; // Trim search space to find least capacity
             }
             else
             {
                 low = mid +1;
             }
         }
        return low;
    }
}
 
