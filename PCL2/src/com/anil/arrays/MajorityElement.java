package com.anil.arrays;

/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than floor(n / 2) times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 

Constraints:

n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
 

Follow-up: Could you solve the problem in linear time and in O(1) space?

Logic : Boyer - Moore voting algorithm

1. take i=nums[0] and count = 1 then you need to find the element which is not equal to i
2. if a element is not equal to i then check count if count > 0 then it means we found a pair in which 2 elements are unique so, count--;
3. if a element is not equal to i but count == 0 then set i to that element.
4. do it till length of array. after iterating the complete array we will get the answer as element present in i.

5. this algo is making pairs of 2 unique elements. so, the element which is present in majority will not be able to pair himself.

*/

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        
        int i = nums[0];
        int c = 1;
        
        for(int k = 1;k<n;k++)
        {
            if(i != nums[k])
            {
                if(c > 0)
                    c--;
                else{
                    i = nums[k];
                    c = 1;
                }
            }
            else
                c++;
        }
        return i;
        
        // fancy code by leetcode
        /*
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
        */
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
		

	}

}
