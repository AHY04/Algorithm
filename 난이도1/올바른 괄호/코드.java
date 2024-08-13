import java.util.*;

class Solution {
    boolean solution(String s) {
        int left, right;
        left = right = 0;
        
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '(') return false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') left++;
            else if(s.charAt(i) == ')' && left > right) right++;
        }
        if(left == right) return true;
        else return false;
    }
}
