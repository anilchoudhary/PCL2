package com.anil.arrays;

import java.util.HashMap;

public class CountMoreThanNKOccurences {
	
	public static int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]) == true)
            {
                int temp = map.get(arr[i]);
                temp += 1;
                map.put(arr[i], temp);
            }
            else
            {
                map.put(arr[i],1);
            }        
        }
        
        int ans = 0;
        for(Integer e : map.keySet())
        {
            int temp = map.get(e);
            if(temp > n/k)
                ans += 1;
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(countOccurence(new int[] {3,1,2,2,1,2,3,3}, 8, 4));

	}

}
