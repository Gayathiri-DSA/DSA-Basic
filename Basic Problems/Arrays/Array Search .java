/*
Array Search
Difficulty: Basic Accuracy: 40.95% Submissions: 421K+ Points: 1 Average Time: 15m
Given an array, arr of n integers, and an integer element x, find whether element x is present in the array. 
Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.
Problem Link : https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=3&sortBy=submissions
*/

class Solution {

    static int search(int arr[], int x) {

//Iterate thru array 
        for(int i=0 ; i<arr.length ; i++)
        {
            // when current ele (i.e i) == element we're searching 
            if(arr[i]==x)
            {
                //return its poisition/index 
                return i;
            }
        }
        // if ele we searchnot in arr thrn return -1
        return -1;
    }
}
