import java.util.*;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] answer = new int[code.length];
        for(int i = 0; i < code.length; i++) {
            if(k>0) {
                for(int j = i+1; j < k+i+1; j++) {
                    answer[i] += code[j%code.length];
                }
            }
            else if(k<0) {
                for(int j = i-1; j > i-1-Math.abs(k); j--) {
                    answer[i] += code[((j%code.length) + code.length) % code.length];
                }
            }
        }
        return answer;
    }
}
