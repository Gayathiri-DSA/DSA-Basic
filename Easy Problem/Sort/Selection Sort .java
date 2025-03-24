/*
Selection Sort
Difficulty: Easy Accuracy: 64.33% Submissions: 194K+ Points: 2 Average Time: 15m
Given an array arr, use selection sort to sort arr[] in increasing order.
Problem Link : https://www.geeksforgeeks.org/problems/selection-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=selection-sort
*/
class Solution {
    void selectionSort(int[] arr) {
        
        int n=arr.length;
        
        // outer loop : iterate thru loop upto 2nd element from last if 2 elements left we need to swap if 1 ele left thn it is already sorted  
        for(int i=0;i<=n-2;i++)
        {
            // initialize min with i / arr[i] (i.e position /value)
            int min =i;
            
            // inner loop : iterate from element taken @ i till last elemet n-1 to take minimum element in arr
            for(int j=i;j<=n-1;j++)
            {
                
                // iff ele @ j < min (i.e i element @i)
               if(arr[j]<arr[min])
               {
                   
                   // update j value to/as min 
                min=j;
               }
            }
            
            // if min element found swap that ele with value @ its index using basic swap function
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
}
