/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    

    public String addBinary(String a, String b) {
        int len = Math.max(a.length(), b.length());
        boolean[] ret = new boolean[len+1];
        boolean[] num1 = stringToBoolList(a, len);
        boolean[] num2 = stringToBoolList(b, len);
        
        boolean carry = false ;

        for (int i = len - 1 ; i >= 0 ; i--) {
            int tot = 0 ;
            tot += num1[i] ? 1 : 0 ;
            tot += num2[i] ? 1 : 0 ;
            tot += carry ? 1 : 0 ;

            carry = (tot / 2) == 1;
            ret[i+1] = (tot % 2)==1;
        }
        
        ret[0] = carry ;
        return boolListToString(ret);
    }
    private String boolListToString(boolean[] ret) {
        String s = new String("");
        int i = 0 ;
        while (i < ret.length && !ret[i])
            i++;
        
        if (i >= ret.length)
            return new String("0");
        for (; i < ret.length ; i++) {
            s+= (ret[i]) ? "1" : "0" ;
        }
        return s ;
    }
    private boolean[] stringToBoolList(String s, int desiredLength) {
        boolean[] ret = new boolean[desiredLength];
        for (int i = 0 ; i < s.length() ; i++) {
            ret[desiredLength-s.length()+i] = (s.charAt(i) == '1');
        }
        for (int i = 0 ; i < desiredLength - s.length() ; i++)
            ret[i] = false ;
        return ret ;
    }

}
// @lc code=end

