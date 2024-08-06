import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> honor = new ArrayList<>();

        for(int i = 0; i < score.length; i++) {
            if(honor.size() >= k) {
                if(honor.get(0) <= score[i]) {
                    honor.set(0, score[i]);
                }
                else {
                    answer[i] = honor.get(0);
                    continue;
                }
            }
            else {
                honor.add(score[i]);
            }
            Collections.sort(honor);
            answer[i] = honor.get(0);
        }
        return answer;
    }
}
