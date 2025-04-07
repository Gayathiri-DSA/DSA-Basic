/*
Longest Consecutive Subsequence
Difficulty: Medium Accuracy: 33.0% Submissions: 349K+ Points: 4 Average Time: 25m
Given an array arr[] of non-negative integers. Find the length of the longest sub-sequence such that elements in the subsequence are consecutive integers, the consecutive numbers can be in any order.
Problem Link : https://www.geeksforgeeks.org/problems/longest-consecutive-subsequence2449/1
*/
class Solution 
{

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) 
    {
        int n=arr.length;
        // edge case : no ele in arr retun 0
        if(n==0)
            return 0;
        // longest var is used to store length initialized to 1    
        int longest=1;
        
        //iterate thru arr ans store it in set ds
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }
        //Find longest sequence using enhanced for loop
        for(int it: set)
        {
            // if set doesnt contains previous ele then it is the start of sequence
            if(!set.contains(it-1))
            {
                //Find consecutive no's
                int cnt=1; // initialize count to 1
                int x=it; // store current ele @ x var
                
                // check if set contains next elements
                while(set.contains(x+1))
                {
                    //update x to next element to find consecutive no's
                    x=x+1;
                    cnt+=1 ; //increase count by 1 to keep track of longest consecutive no's
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }
}
