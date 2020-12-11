```
4. Median of Two Sorted Arrays
Hard

8616

1327

Add to List

Share
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

Follow up: The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000
Example 4:

Input: nums1 = [], nums2 = [1]
Output: 1.00000
Example 5:

Input: nums1 = [2], nums2 = []
Output: 2.00000
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
Accepted
805.4K
Submissions
2.6M
```
# CODE JAVA

```
class Solution 
{
    public double findMedianSortedArrays(int[] n1, int[] n2)
    {  ArrayList <Integer> n=new ArrayList<>();
        for(int i: n1)
            n.add(i);
        for(int i:n2)
            n.add(i);
      Collections.sort(n);
     
     if(n.size()%2==1)
     {
         return n.get(n.size()/2);
     }
      
     else
     {
         int sum=n.get(n.size()/2)+n.get((n.size()/2)-1);
         System.out.println(sum);
         return (double)sum/2;
     }
    
        
    }
}

```
