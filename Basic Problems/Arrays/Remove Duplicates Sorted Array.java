/*
Remove Duplicates Sorted Array
Difficulty: Easy Accuracy: 38.18% Submissions: 278K+ Points: 2 Average Time: 20m
Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array 
such that all the distinct elements come at the beginning of the original array.
problem link : https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
*/


class Solution 
{
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) 
    {
       // Approach using : two pointers i & j
       
       
        int i=0; // initializing i = 0 gives the value at 0 th index (i.e position of the last unique element found.)
        
        // iterate thru array using j
        for(int j=1;j<arr.length;j++)
        {
            //check if current value i != to j // to find unique elements if true enters loop
            
            //  current element arr[j] is compared with arr[i] (the last unique element found).
            if(arr[i]!= arr[j])
            {
             // that unique ele at j is stored next to i -- i+1 then increment i 
             
             //element at arr[j] is unique, so it is placed at arr[i+1], and then i is incremented.
                arr[i+1]=arr[j];
                i++;
            }
        }
         // number of unique elements in the array after duplicates have been removed.
        return i+1;
    }
}
/*Method :
    ** the i pointer to track the position of unique elements, 
    **while j traverses the entire array to compare with i. 
    **Once a unique element is found, it is placed at the next position after i.
 */
