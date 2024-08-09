class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0, j = 0;
        
        for(int i = 1; i <= n; i++) {
            if(j == section.length) break;
            if(section[j] != i) {
                if(section[j] > i) continue;
                else {
                    j++;
                    i--;
                }
            }
            else {
                answer++;
                j++;
                i += m-1;
            }
        }
        return answer;
    }
}
