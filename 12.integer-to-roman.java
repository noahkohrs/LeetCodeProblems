/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {

    public String intToRoman(int num) {
        List<Duo> duos = initDuos();

        String res = "";

        for (int i = 0; i < duos.size(); i++) {
            Duo d = duos.get(i);
            res += d.add(num);
            System.out.println(d.number + " : " + d.roman);
            num -= d.number*(num/d.number);
        }

        return res;
    }

    private List<Duo> initDuos() {
        List<Duo> l = new ArrayList<Duo>();
        l.add(0, new Duo("M", 1000));
        l.add(1, new Duo("CM", 900));
        l.add(2, new Duo("D", 500));
        l.add(3, new Duo("CD", 400));
        l.add(4, new Duo("C", 100));
        l.add(5, new Duo("XC", 90));
        l.add(6, new Duo("L", 50));
        l.add(7, new Duo("XL", 40));
        l.add(8, new Duo("X", 10));
        l.add(9, new Duo("IX", 9));
        l.add(10, new Duo("V", 5));
        l.add(11, new Duo("IV", 4));
        l.add(12, new Duo("I", 1));
        return l ;
    }

    class Duo {
        String roman;
        int number;

        Duo(String r, int n) {
            roman = r;
            number = n;
        }
        String add(int num) {
            String s = "";
            while (num >= number) {
                s+=roman ;
                num-=number;
            }
            return s;
        }
    }
}
// @lc code=end
