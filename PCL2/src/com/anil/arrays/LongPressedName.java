package com.anil.arrays;

/*
Your friend is typing his name into a keyboard. Sometimes, when typing a character c, 
the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. 
Return True if it is possible that it was your friends name, 
with some characters (possibly none) being long pressed.

 

Example 1:

Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
Example 2:

Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it wasn't in the typed output.
Example 3:

Input: name = "leelee", typed = "lleeelee"
Output: true
Example 4:

Input: name = "laiden", typed = "laiden"
Output: true
Explanation: It's not necessary to long press any character.
 

Constraints:

1 <= name.length <= 1000
1 <= typed.length <= 1000
name and typed contain only lowercase English letters.
*/


public class LongPressedName {

    public static boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int m = typed.length();
        
        if(n > m)
            return false;
        
        
        int i=0,j=0;
        
        while(i < n &&  j < m)
        {
            char ch1 = name.charAt(i);
            char ch2 = typed.charAt(j);
            if(ch1 == ch2)
            {
                i++;
                j++;
            }
            else
            {
                if(i> 0 && ch2 == name.charAt(i-1))
                    j++;
                else
                    return false;
            }
        }
        while(j<m)
        {
            if(typed.charAt(j++) != name.charAt(i-1))
                return false;
        }
        if(i<n)
            return false;
        return true;
     }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ans = isLongPressedName("alex", "aalleeexx");
		System.out.println(ans);

	}

}
