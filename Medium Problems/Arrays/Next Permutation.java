/*
Next Permutation
Difficulty: Medium Accuracy: 40.66% Submissions: 199K+ Points: 4 Average Time: 20m
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 
Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.
Problem Link:https://www.geeksforgeeks.org/problems/next-permutation5226/1
*/

class Solution 
{
    void nextPermutation(int[] arr)
    {
       
        int n=arr.length;
        int index=-1;
        // Find the break point -- longest prefix
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index=i;
                break;
            }
        }
        // Edge case: If no break point found then simmply reverse arr
        if(index==-1)
        {
            Arrays.sort(arr);
            return;
            
        }
        //Find the next greatest ele and swap
        for(int i=n-1;i>index;i--)
        {
            if(arr[i]>arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }
        //Reverse rest of ele on right half in sorted order
        //fromIndex: inclusive
        //toIndex: exclusive n-1
        //Arrays.sort(arr, start, arr.length);
        Arrays.sort(arr,index+1,n);
        

    }
}
