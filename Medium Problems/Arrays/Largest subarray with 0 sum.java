/*
Largest subarray with 0 sum
Difficulty: Medium Accuracy: 41.84% Submissions: 401K+ Points: 4 Average Time: 20m
Given an array arr containing both positive and negative integers, the task is to compute the length of the largest subarray that has a sum of 0.
Problem Link :https://www.geeksforgeeks.org/problems/largest-subarray-with-0-sum/1?category%5B%5D=Hash&company%5B%5D=Amazon&page=1&query=category%5B%5DHashcompany%5B%5DAmazonpage1company%5B%5DAmazoncategory%5B%5DHash&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=largest-subarray-with-0-sum
*/

class Solution {
    int maxLen(int arr[]) {
        
        // Use Hash map DS stores the prefix sum of every element as a key and its index as a value.
        HashMap <Integer,Integer > map = new HashMap<>();
        // Initializing maxi & sum to 0 maxi stores -->length of Largest subarray with sum 0 
        int maxi = 0;
        int sum = 0; 
        
        // as we Iterate thr arr and store elements in map using (key,value) -- >(element,index) if multiple occurence present stick with 1st index
        for(int i = 0 ; i< arr.length ; i++)
        {
            // During iteration add element to sum & keep updating sum as we iterate
            sum += arr[i];
            
            //Condition sum == 0 --> sub array found mark its index and store it in maxi
            if(sum == 0)
            {
                maxi = i+1;
            }
            
            //Check map contains element or not if present --> choose maximum subarray that gave sum 0 ; not present --  add it in map
            if(map.containsKey(sum))
            {
                maxi = Math.max(maxi , i-map.get(sum));
            }
            else
            {
                map.put(sum , i); // sum and its index
            }
        }
        return maxi;
    }
}
/*Note : 
    map.get(sum) returns the index where this sum first occurred.
    To get the length of the subarray that gives zero sum, you need to subtract that index from the current index i.
    
    map.contains(sum)
        This is invalid for a HashMap — it doesn't compile unless map is declared as a Map of raw type (which is discouraged).
        contains() is actually a method from collections like ArrayList, HashSet, etc., not HashMap.
    
    */
