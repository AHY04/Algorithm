import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int idx = 0;
        List<Integer> ponketmon = new ArrayList<>();
        Arrays.sort(nums);
        ponketmon.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            if(ponketmon.size() == nums.length / 2) break;
            if(ponketmon.get(idx) != nums[i]) {
                ponketmon.add(nums[i]);
                idx++;
                answer++;
            }
        }
        return answer;
    }
}
