class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a) + Integer.toString(b);
        String d = Integer.toString(b) + Integer.toString(a);
        
        if(Integer.parseInt(c) > Integer.parseInt(d)) {
            answer = Integer.parseInt(c);
        }
        else {
            answer = Integer.parseInt(d);
        }
        return answer;
    }
}
