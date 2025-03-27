/*
Third largest element
Difficulty: Easy Accuracy: 45.04% Submissions: 144K+ Points: 2 Average Time: 15m
Given an array, arr of positive integers. Find the third largest element in it. Return -1 if the third largest element is not found.
Problem Link : https://www.geeksforgeeks.org/problems/third-largest-element/1
*/
class Solution
{
    int thirdLargest(int arr[])
    {
        // initialize three variable to store largest elements l--largest value 1,2,3 
        //If we initialize l1, l2, and l3 to 0, the logic may fail for arrays with only negative numbers.;incorrectly considers 0 as the largest number
        int l1=0;
        int l2=0;
        int l3=0;
        
        // edge case : to fing largest 3 there has to be atleast 3 elements if not return -1
        //if(arr.length < 3) return -1; 
        
        // iterate thru arr 
        for(int i=0;i<arr.length;i++)
        {
            // as we iterate thru arr the ele @ i > l1 == then push that element to be largest by swapping -- now we've found largest element
            if(arr[i] > l1)
            {
                // push i to l1 then change elemt already @ l1 to l2 element @ l2 to l3
                l3 = l2;
                l2 = l1;
                l1=arr[i];
            }
            
            //similarly to find  second largest l2 == check current ele @ i >= l2 && <= l1
            else if(arr[i] >=l2 && arr[i] <=l1 )
            {
                l3 = l2; // push ele @ large 2 to large 3
                l2 = arr[i]; // put current ele to largest 2 if condition satisfies
            }
            else if( arr[i] >= l3 && arr[i]<=l2)
            {
                l3 = arr[i];
            }
            
        }
        return l3;
    }
}
/*
Note :
// using inbuilt function sort which has TC:O(nlogn) compared to iterative approach which is of O(n) -- n no of elements in arr
        int n=arr.length;
        
        //sort the array 
         Arrays.sort(arr);
         
         // then return the third largest element from last 
           return arr[n-3];*/
