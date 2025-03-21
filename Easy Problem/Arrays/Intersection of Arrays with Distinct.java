/*
Intersection of Arrays with Distinct
Difficulty: Easy Accuracy: 32.83% Submissions: 220K+ Points: 2 Average Time: 20m
Given two unsorted integer arrays a[] and b[] each consisting of distinct elements, the task is to return the count of elements in the intersection (or common elements) of the two arrays.
Intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 
Problem Link : https://www.geeksforgeeks.org/problems/intersection-of-two-arrays2404/1?page=2&category=Arrays&difficulty=Easy&sortBy=submissions
*/

class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        //Treeset used to store unique elements in sorted order
       TreeSet<Integer> set=new TreeSet<Integer>();
       
       // intitalize count to 0
       int count = 0;
       
       //iterate thru arr a and add element in set
       for(int i=0;i<a.length;i++)
       {
            set.add(a[i]);
       }       
       // iterate thru arr b and check element is already in set if so increase the count and remove from b
        for(int i=0;i<b.length;i++)
        {
            if(set.contains(b[i]))
            {
                count ++;
                set.remove(b[i]);//Ensures that duplicates in b don’t count multiple times.

               }
           
       }
       // we only need to provide the count rather the intersecting element
       
       return count;
    }
}
