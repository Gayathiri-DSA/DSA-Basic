/* 
Merge Sort
Difficulty: MediumAccuracy: 54.1%Submissions: 235K+Points: 4Average Time: 15m
Given an array arr[], its starting position l and its ending position r. Sort the array using the merge sort algorithm.
Problem Link : https://www.geeksforgeeks.org/problems/merge-sort/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=merge-sort
*/

class Solution {

    void mergeSort(int arr[], int l, int r) 
    {
        
        // sort 2 Half left,right using Recursion -- function that calls itself and backtracking 
        
        // Base condt : There is one element left (i.e both left & right pts to same element) after dividing entire arr then return do ntg;
        if(l>=r) return ;
        
        //To divide the ha;ves into further until one element left
        int mid = (l+r)/2;
        
        //Function to sort left half -- till mid
        mergeSort(arr,l,mid);
        
        //Function to solve right half i.e after mid
        mergeSort(arr,mid+1,r);
        
        // Function declaration :  to sort both sorted Halves -- 0(left) -- mid---mid+1---n-1(rigth)
        merge(arr,l,mid,r);
    }
    void merge(int []arr,int l,int mid,int r)
    {
        //Creating a temorary array using arraylist ---due to its dynamic nature
        ArrayList<Integer> result = new ArrayList<>();
        
        //Initializing left,right
        int left =l , right=mid +1;
        
        while(left <= mid && right <= r)
        {
            // compare elements on left with right if left is smaller then add it to arr--result then move pointer
            if(arr[left] <= arr[right])
            {
                result.add(arr[left]);
                left++;
            }
            // whn right ele is smaller then add it to result arr then move right pointer
            else
            {
                result.add(arr[right]);
                right++;
            }
        }
        
        //What if element in left becomes empty / exhausted then without comparing(to take small element ) simply add element to result arr as the both halves are already sorted --we're meging them in result
        while(left <= mid)
        {
           result.add(arr[left]);
                left++; 
        }
        //What if element in right becomes empty / exhausted then without comparing(to take small element ) simply add element to result arr as the both halves are already sorted -- then move pointer till n-1 to add all remaining  elements in the list 
        while(right <= r)
        {
           result.add(arr[right]);
                right++; 
        }
       
       //This loop copies the sorted elements from the temporary array (result) back to the original array (arr) in their correct positions.
       //Move the temporary arrlist -- result back to the original array in sorted order using Merge sort 
       
       for(int i=l ; i<=r ;i++)
       {
           arr[i]=result.get(i-l); //since everthing is  by reference numbers rearrange themselves in arr ; first element of result corresponds to arr[l]
       }
        
    }
}
/*Note :
    **Recursive Divide and Conquer

        The mergeSort() function divides the array into two halves recursively until a single element is left.
        The merge() function merges the sorted halves.

    **Merge Function

    Compares elements from two halves and merges them in sorted order into a temporary list (result).
    If one half gets exhausted first, the remaining elements are directly added (since both halves are already sorted).
    The sorted elements from result are copied back to the original array.
    
    */
