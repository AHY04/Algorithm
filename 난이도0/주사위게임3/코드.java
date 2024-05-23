import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        Integer[] p = {a, b, c, d};
        int answer = 0;
        Arrays.sort(p, Collections.reverseOrder());
        if(p[0] == p[3]) {
            answer = p[0] * 1111;
        }
        else if(p[0] == p[1]) {
            if(p[1] == p[2]) {
                answer = (10 * p[0] + p[3]) * (10 * p[0] + p[3]);
            }
            else if(p[2] == p[3]) {
                answer = (p[0] + p[2]) * Math.abs(p[0] - p[2]); 
            }
            else {
                answer = p[2] * p[3];
            }
        }
        else {
            if(p[1] == p[2] && p[2] == p[3]) {
                answer = (10 * p[3] + p[0]) * (10 * p[3] + p[0]);
            }
            else if(p[1] == p[2]) {
                answer = p[0] * p[3];
            }
            else if(p[2] == p[3]) {
                answer = p[0] * p[1];
            }
            else {
                answer = p[3];
            }
        }
        return answer;
    }
}
