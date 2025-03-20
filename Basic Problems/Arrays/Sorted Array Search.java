/*
Sorted Array Search
Difficulty: Basic Accuracy: 48.03% Submissions: 344K+ Points: 1 Average Time: 20m
Given an array, arr[] sorted in ascending order and an integer k. Return true if k is present in the array, otherwise, false.
Problem Link :https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
*/


class Solution 
{
    static boolean searchInSorted(int arr[], int k) 
    {
        // iterate thru arr upto end  
       for(int i=0 ;i<arr.length;i++)
       {
           // when arr@ i == the number we're searching
           if(arr[i]==k)
           {
               //then return true ; number found
               return true;
           }
       }
       // if no not present return false
       return false;
    }
    
}
