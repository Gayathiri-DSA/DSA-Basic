/*
Sort 0s, 1s and 2s
Difficulty: Medium Accuracy: 50.58% Submissions: 758K+ Points: 4 Average Time: 10m
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.
You need to solve this problem without utilizing the built-in sort function.
Problem Link : https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1?page=1&category=Arrays&difficulty=Medium&sortBy=submissions 
*/
class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        
        
       // using three ptr --dutch national flag algo
       int n= arr.length;
       int low =0,high = n-1;
       int mid=0;
       
       while(mid <=high)
       { // mid - 0 swap mid with low then incr ptrs
           if(arr[mid]==0)
           {
               int temp = arr[low];
               arr[low] = arr[mid];
               arr[mid]= temp;
               
               low++;
               mid++;
               
           }
           // mid - 1 simply move mid ptr
           else if(arr[mid]==1)
           {
               mid++;
           }
           // mid-2 swap high with mid then decrease ptr high
           else
           {
               int temp = arr[mid];
               arr[mid]=arr[high];
               arr[high] = temp;
               
               high--;
           }
       }
       
    }
}
