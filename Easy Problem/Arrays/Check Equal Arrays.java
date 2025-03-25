/*
Check Equal Arrays
Difficulty: Easy Accuracy: 42.18% Submissions: 384K+ Points: 2 Average Time: 30m
Given two arrays a[] and b[] of equal size, the task is to find whether the elements in the arrays are equal.
Two arrays are said to be equal if both contain the same set of elements, arrangements (or permutations) of elements may be different though.
Note: If there are repetitions, then counts of repeated elements must also be the same for two arrays to be equal.
Problem Link : https://www.geeksforgeeks.org/problems/check-if-two-arrays-are-equal-or-not3847/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article
*/
class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        
        //Sort arr a & b using inbuilt function to check if both r equal or not
        Arrays.sort(a);
        Arrays.sort(b);
        
        // iterate thru arr a 
        for(int i=0; i<a.length ; i++)
        {
            // After checking if both arrays are ! equal return false else true ps: always check for worst case
            if(a[i]!=b[i])
            {
                return false;
            }
        }
        // if array a is  equal to be return true 
        return true;
    }
}
