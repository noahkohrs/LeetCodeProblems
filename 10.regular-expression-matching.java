/*
 * @lc app=leetcode id=10 lang=java
 *
 * [10] Regular Expression Matching
 */




// @lc code=start

import java.util.*;
class Solution {
    public boolean isMatch(String s, String p) {
        Regexp regexp = new Regexp(p);
        return regexp.eval(s);
    }

}

class Regexp {
    List<RegexpPart> letters;
    Regexp(List<RegexpPart> letters) {
        this.letters = letters;
    }
    Regexp(String s) {
        this.letters = new ArrayList<>();
        for (int i=0 ; i < s.length() ; i++) {
            char c = s.charAt(i);
            RegexpPart symbol = new Symbol(c);
            while (i+1 < s.length() && s.charAt(i+1) == '*') {
                symbol = new Star(symbol);
                i++;
            }
            this.letters.add(symbol);
        }
    }

    public boolean eval(String s) {
        if (s.length() == 0) {
            if (this.letters.size() == 0) return true;
            if (this.letters.size() == 1 && this.letters.get(0) instanceof Star) return true;
            return false;
        }
        if (this.letters.size() == 0) return false;

        return false;
    }
}
abstract class RegexpPart {
    // Class that has to be extended by Symbol and Star
    // eval exist but has to be implemented by Symbol and Star
    abstract boolean eval(String s, int i) ;
}

class Symbol extends RegexpPart {
    char c;
    Symbol(char c) {
        this.c = c;
    }

    boolean eval(String s, int i) {
        return s.charAt(i) == c || c == '.';
    }
}

class Star extends RegexpPart {
    RegexpPart part;
    Star(RegexpPart part) {
        this.part = part;
    }

    boolean eval(String s, int i) {
        
    }
}

// @lc code=end

