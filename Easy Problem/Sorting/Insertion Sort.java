/*
Insertion Sort
Difficulty: Easy Accuracy: 66.61% Submissions: 223K+ Points: 2 Average Time: 15m
The task is to complete the insertsort() function which is used to implement Insertion Sort.
Problem Link : https://www.geeksforgeeks.org/problems/insertion-sort/0?category%5B%5D=Algorithms&page=1&query=category%5B%5DAlgorithmspage1&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=insertion-sort
*/

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        
        //Inserion Sort : Pick out an element & place it in its crt order
        
        //iterate thru last element in array  
        for(int i=0;i<=arr.length-1;i++)
        {
            //pick out element from i & store it in j
            int j=i;
            
            //Check : j > 0 check upto 1st element in arr --0 based indexing cause we do j-- if we go thru j>=0 -- -1 will be index which may lead to ArrayIndexOutoFBoundexception
            while(j>0 && arr[j-1]>arr[j])
            {
                // if condition is true : then do swap cur element with previous /left element
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                
                //upto crt place is found for cur element 
                j--;
            }
        }
    }
}
