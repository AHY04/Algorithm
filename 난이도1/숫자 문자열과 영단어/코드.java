import java.util.*;

class Solution {
    public int solution(String s) {
        String answer = "";
        
        for(int i = 0; i < s.length();) {
            if(s.charAt(i) == 'z') {
                answer += '0';
                i += 4;
            }
            else if(s.charAt(i) == 'o') {
                answer += '1';
                i += 3;
            }
            else if(s.charAt(i) == 't') {
                if(s.charAt(i+1) == 'w') {
                    answer += '2';
                    i += 3;
                }
                else if(s.charAt(i+1) == 'h') {
                    answer += '3';
                    i += 5;
                }
            }
            else if(s.charAt(i) == 'f') {
                if(s.charAt(i+1) == 'o') {
                    answer += '4';
                    i += 4;
                }
                else if(s.charAt(i+1) == 'i') {
                    answer += '5';
                    i += 4;
                }
            }
            else if(s.charAt(i) == 's') {
                if(s.charAt(i+1) == 'i') {
                    answer += '6';
                    i += 3;
                }
                else if(s.charAt(i+1) == 'e') {
                    answer += '7';
                    i += 5;
                }
            }
            else if(s.charAt(i) == 'e') {
                answer += '8';
                i += 5;
            }
            else if(s.charAt(i) == 'n') {
                answer += '9';
                i += 4;
            }
            else {
                answer+= s.charAt(i);
                i++;
            }
        }
        int result = Integer.valueOf(answer);
        
        return result;
    }
}
