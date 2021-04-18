package com.anil.arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {

	public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        
        int t1 = nums[0];
        int c1 = 1;
        int t2 = t1;
        int c2 = 0;
        
        for(int i=1;i<n;i++)
        {
            if (nums[i] == t1)
			c1++;
            else if (nums[i] == t2)
                c2++;
            else if (c1 == 0) {
                t1 = nums[i];
                c1 = 1;
            } else if (c2 == 0) {
                t2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        
        c1 = 0;
        c2 = 0;
        
        for(int i=0;i<n;i++)
        {
            if(t1 == nums[i])
                c1++;
            else if(t2 == nums[i])
                c2++;
        }
        List<Integer> ans = new ArrayList<>();
        if(c1 > n/3)
            ans.add(t1);
        if(c2 > n/3)
            ans.add(t2);
        return ans;
            
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(MajorityElement2.majorityElement(new int[] {2,3,3,2,1}));
	}

}
