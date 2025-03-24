/*
Bubble Sort
Difficulty: Easy Accuracy: 59.33% Submissions: 282K+ Points: 2 Average Time: 15m
Given an array, arr[]. Sort the array using bubble sort algorithm.
Problem Link : https://www.geeksforgeeks.org/problems/bubble-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=bubble-sort*/
class Solution 
{
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) 
    {
        /*//Bubble sort :
        Maximum element is pushed to last by using ADJACENT SWAP
        */
    
        // store arr length in n variable
        int n=arr.length;
        
        // outer loop :iterate thru loop from last ele to 1st
        for(int i=n-1;i>=1;i--)
        {
            //inner Loop : chk - j <= i-1
            for(int j=0;j<=i-1;j++)
            {
                // Compare current element (j)  with next element(j+1) is true then swap
                if(arr[j]>arr[j+1])
                {
                    //Basic Swapping
                   int temp=arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]=temp;
                }
            }
        }
    }
}
