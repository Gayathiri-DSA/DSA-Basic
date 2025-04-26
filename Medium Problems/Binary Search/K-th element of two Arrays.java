/*
K-th element of two Arrays
Difficulty: Medium Accuracy: 37.4% Submissions: 334K+ Points: 4 Average Time: 15m
Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.
Problem Link :https://www.geeksforgeeks.org/problems/k-th-element-of-two-sorted-array1317/1
*/

class Solution {
    public int kthElement(int a[], int b[], int k) {
       int n1 = a.length;
       int n2= b.length;
       
       //swap if arr1 > arr2 we're considering smaller array as arr1
       if(n1 > n2) 
           return kthElement(b,a,k);
           
           int left = k; // length of left half
           
       // apply binary search:
        int low = Math.max(0, k - n2), high = Math.min(k, n1);
        
        while (low <= high)
        {
            int mid1 = (low + high) >> 1; //Bitwise opeartor works same as /2 but fast processing.
            int mid2 = left - mid1;
            
            // calculate l1, l2, r1, and r2
            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE;
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;
            if (mid1 < n1) 
                r1 = a[mid1];
            if (mid2 < n2) 
                r2 = b[mid2];
            if (mid1 - 1 >= 0) 
                l1 = a[mid1 - 1];
            if (mid2 - 1 >= 0)  
                l2 = b[mid2 - 1];

            if (l1 <= r2 && l2 <= r1) 
            {
                return Math.max(l1, l2);
            }

            // eliminate the halves:
            else if (l1 > r2) 
                high = mid1 - 1;
            else    
                low = mid1 + 1;
        }
        return 0; // dummy statement
    }
}
/*note :

Range of x:

The maximum possible value of x: 
    We want to build the left subarray of size k. So, the maximum possible value should be k. 
    But if we are considering arr1[] of size n1 and n1 < k, in that case, the maximum possible value will be n1. 
    So, after generalization, the maximum value will be min(k, n1), where n1 = the size of the smaller array. Here n1 = min(m, n).
The minimum possible value of x: 
    Let’s understand this using an example, given arr1[] size i.e. m = 6, and arr2[] size i.e. n = 5 and k = 7. Now, the lowest value of x(i.e. The no. of elements we should take from arr1[]) should be 2. 
    If we have to build an array of size, 7, and the maximum element we can take from arr2[] is 5, so, we have to take a minimum of 2 elements from arr1[].

So, the minimum possible value should be k-n2, where n2 = the size of the not-considered array i.e. the bigger array.

But if k < n2, the k-n2, will be negative. So, to handle this case, we will consider the minimum value as max(0, k-n2), where n2 = the size of the bigger array, and here, n2 = max(m, n).*/
