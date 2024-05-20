import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String numString = Integer.toString(i);
            boolean found = true;
            
            for (int j = 0; j < numString.length(); j++) {
                char digit = numString.charAt(j);
                
                if (digit != '0' && digit != '5') {
                    found = false;
                    break;
                }
            }
            
            if (found) {
                answer.add(i);
            }
        }
        
            return answer.isEmpty() ? new int[]{-1} :answer
                   .stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}
