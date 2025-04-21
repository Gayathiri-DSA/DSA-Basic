/*
Aggressive Cows
Difficulty: Medium Accuracy: 59.57% Submissions: 122K+ Points: 4 Average Time: 30m
You are given an array with unique elements of stalls[], which denote the position of a stall. You are also given an integer k which denotes the number of aggressive cows. 
Your task is to assign stalls to k cows such that the minimum distance between any two of them is the maximum possible.
Problem Link : https://www.geeksforgeeks.org/problems/aggressive-cows/1
*/

class Solution
{
    public static boolean canWePlace(int[] stalls, int k , int dist)
    {
        // Initializing 1st cow  @ 0th index with cntcow and last variable
        int cntcows =1 ,last =stalls[0]; 
        //Iterate thru arr
        for(int i=1 ;i < stalls.length ;i++)
        {
            //Cur stall - cow places @ last stall coord >= minimum distance
            if(stalls[i] - last >= dist)
            {
                //Placed 1 more cow / next
                cntcows++;
                
                // last cow placed/location is updated 
                last = stalls[i];
            }
            // if we can place more cows than k 
            //then it is possible minimum distance and look for max which we can place with minimum distance ==> max(min distance) 
            if(cntcows >= k) return true;
        }
            return false;   
    }
    
    public static int aggressiveCows(int[] stalls, int k)
    {
        Arrays.sort(stalls);
        // RANGE : low =1 ,high = (max - min)
        int low =1 , high = stalls[stalls.length -1] - stalls[0];
        while(low <= high)
        {
            int mid = (low + high)/2;
            
            if(canWePlace(stalls,k,mid)==true)
            {
                //Trim search space look for max in right half eliminate left
                low = mid +1;
            }
            else
            {
                high = mid -1;
            }
        }
        return high;
    }
}
