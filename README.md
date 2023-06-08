# dsa-sql-leetcode

===================Leetcode Top 150======================</br>
88. Merge Sorted Array (Day01)--Easy

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1. </br>
````
class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {


    int i = m - 1;
    int j = n - 1;
    int k = m + n - 1;
    while (j >= 0)
      if (i >= 0 && nums1[i] > nums2[j]){
        nums1[k--] = nums1[i--];
      }
       
      else{
        nums1[k--] = nums2[j--];  
      } 

    }
}
```` 

Another approach
````
  private static void mergeSortedArray2(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
````






==============Arrays-01 (20-05-23 -- 23-05-23 ) ========================== </br>
Topics : </br>
Basic Array Operation, Bubble sort, Insertion Sort, Quick Sort, Merge Sort  </br>
Video Link For Java - https://www.youtube.com/watch?v=NTHVTY6w2Co&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=10 </br>
https://www.youtube.com/watch?v=18Zt5I4S45o&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=11 </br>

Python - https://www.youtube.com/watch?v=Mshvl3yOejU </br>
Sorting Video Python - https://www.youtube.com/watch?v=Nkw6Jg_Gi4w&list=PLj8W7XIvO93rJHSYzkk7CgfiLQRUEC2Sq </br>

-----------------------------Problems------------------------- </br>
1. https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1 </br>
2. https://practice.geeksforgeeks.org/problems/reverse-a-string/1 </br>
3. https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1 </br>
4. https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1 </br>
5. https://www.geeksforgeeks.org/quick-sort/  (Optional) if possible then try </br>

------------------------------------------------------------------------------------ </br>
Insertion Sort : https://practice.geeksforgeeks.org/problems/insertion-sort/1 </br>

--------------------Sumission------------------</br>
5. Quick Sort
![image](https://github.com/ahmed-bulbul/dsa-sql-leetcode/assets/116268132/1bf9467c-3952-4139-84e4-0a370b536174) </br>

Farahan - Not Comoleted</br>
Bulbul - Not Compelted</br>

</br></br></br></br></br></br>

=============== String(19-05-2023) =================================== </br>
String concat </br>
String reverse </br>
String to array </br>
video link for java ( https://www.youtube.com/watch?v=vCRD36bG8xQ&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=12) </br>

String concat - Python ( https://www.youtube.com/watch?v=28FUVmWU_fA) </br>
String reverse - Python ( https://www.youtube.com/watch?v=Gzy0fmDMdkQ) </br>
Convert String to array - Python ( https://www.youtube.com/watch?v=7TmXzTt8jjM) </br>

==============Problems ===================</br></br>
You are given a string s. You need to reverse the string.</br>

Example 1:</br>

Input:</br>
s = Geeks</br>
Output: skeeG</br>
Example 2:</br>

Input:</br>
s = for</br>
Output: rof</br>
Your Task:</br>

You only need to complete the function reverseWord() that takes s as parameter and returns the reversed string.</br>

Expected Time Complexity: O(|S|).</br>
Expected Auxiliary Space: O(1).</br>

Constraints:</br>
1 <= |s| <= 10000</br>

=====Submission Link =========</br>
https://practice.geeksforgeeks.org/problems/reverse-a-string/1   </br>


========= Submission ========== </br>
Bulbul --- Done ✓ </br>
![image](https://github.com/ahmed-bulbul/dsa-sql-leetcode/assets/70557643/ccee3e4a-273c-4681-8edc-1f5e5c695d9d) </br>

Farhana --- Done ✓ </br>
![image](https://github.com/ahmed-bulbul/dsa-sql-leetcode/assets/70557643/ac8250c5-aa06-4b50-837c-a452f5ec10f2)

