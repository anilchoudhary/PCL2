package com.anil.arrays;

/*

Given n non-negative integers a1, a2, ..., an , 
where each represents a point at coordinate (i, ai). n vertical lines are drawn such that 
the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, 
together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. 
In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104


Logic :

1. use two pointers, one from start and one from last.
2. calculate maximum water possible between 2 lines.
3. increment the pointer from that side where lines height is smaller.
4. using above logic just calculate maximum possible water between lines.

 */

public class ContainerWithMostWater {

	 public static int maxArea(int[] height) {
	        int n = height.length;
	        int ans = 0;
	        int i=0,j=n-1;
	        while(i<j)
	        {
	            int temp = Math.min(height[i],height[j]);
	            temp *= j-i;
	            if(temp > ans)
	                ans = temp;
	            if(height[i] > height[j])
	                j--;
	            else
	                i++;
	        }
	        
	        return ans;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

	}

}
