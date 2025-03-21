/*
Number of occurrence
Difficulty: EasyAccuracy: 59.34%Submissions: 310K+Points: 2Average Time: 20m
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[].
problem link :https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1?page=2&category=Arrays&difficulty=Easy,Medium&sortBy=submissions
*/
class Solution 
{
    int countFreq(int[] arr, int target)
    {
        //Initialise count to 0
        int cnt=0;
        // iterate thru arr 
        for(int i=0;i<arr.length;i++)
        { // if value @ arr[i] == target the occurence of the no to be found
            if(arr[i]==target)
            {
                // then increse the count by 1
                cnt++;
            }
        }
        // return count the number of occurrences of target in arr[]. 
        return cnt;
    }
}
/*note:
NEED TO OPTIMISE MAYBE USING BST
*/
