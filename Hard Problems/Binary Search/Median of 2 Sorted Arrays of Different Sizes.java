/*
Median of 2 Sorted Arrays of Different Sizes
Difficulty: Hard Accuracy: 28.4% Submissions: 130K+ Points: 8 Average Time: 35m
Given two sorted arrays a[] and b[], find and return the median of the combined array after merging them into a single sorted array.
Problem Link : https://www.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1

*/
class Solution 
{
    public double medianOf2(int a[], int b[]) 
    {
        // Size of two given arrays
        int n1 = a.length;
        int n2 = b.length;

        int n = n1 + n2; //total size
        //required indices:
        int ind2 = n / 2;
        int ind1 = ind2 - 1;
        int cnt = 0;
        int ind1el = -1, ind2el = -1;

        //apply the merge step:
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                if (cnt == ind1) ind1el = a[i];
                if (cnt == ind2) ind2el = a[i];
                cnt++;
                i++;
            } else {
                if (cnt == ind1) ind1el = b[j];
                if (cnt == ind2) ind2el = b[j];
                cnt++;
                j++;
            }
        }

        //copy the left-out elements:
        while (i < n1) {
            if (cnt == ind1) ind1el = a[i];
            if (cnt == ind2) ind2el = a[i];
            cnt++;
            i++;
        }
        while (j < n2) {
            if (cnt == ind1) ind1el = b[j];
            if (cnt == ind2) ind2el = b[j];
            cnt++;
            j++;
        }

        //Find the median:
        if (n % 2 == 1) {
            return (double)ind2el;
        }

        return (double)((double)(ind1el + ind2el)) / 2.0;
    

    }
}
