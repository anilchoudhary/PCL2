package com.anil.arrays;

/*
 
 Given an integer array nums sorted in non-decreasing order, 
 return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in non-decreasing order.
 

Follow up: Squaring each element and sorting the new array is very trivial, 
could you find an O(n) solution using a different approach?

Logic 1:

1. take 2 pointers, one from starting and one from end.
2. compare square of both of them whose square is greater put in result array.
3. increment  or decrement the pointers whose square was greater.
4. run the loop till i <= j.
 
 */


				

public class SquaresOfASortedArray {

	public static int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        int p=n-1;
        while(i<=j) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p--] = A[i] * A[i];
                i++;
            } else {
                result[p--] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans = (sortedSquares(new int[]{-4,-1,0,1,5,8,9})); 
		
		for(int x : ans)
			System.out.println(x);

	}

}
