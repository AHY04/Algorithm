import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] rank = new String[score.length+1];
        int[] sorted = Arrays.sort(score);
        for(int i = 0; i < score.length; i++) {
            for(int j = 0; j < sorted.length; j++) {
                if(j == 0) {
                    if(score[i] == sorted[j]) rank[i] = "Gold Medal";
                }
                else if(j == 1) {
                    if(score[i] == sorted[j]) rank[i] = "Silver Medal";
                }
                else if(j == 2) {
                    if(score[i] == sorted[j]) rank[i] = "Bronze Medal";
                }
                else {
                    if(score[i] == sorted[j]) rank[i] = Integer.toString(j+1);
                }
            }
        }
        return rank;
    }
}
