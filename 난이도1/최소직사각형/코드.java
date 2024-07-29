class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_1 = 0, max_2 = 0;
        
        for(int[] a : sizes) {
            int b = a[0];
            int c = a[1];
            
            if(c > b) {
                int temp = b;
                b = c;
                c = temp;
            }
            if(max_1 < b) {
                max_1 = b;
            }
            if(max_2 < c) {
                max_2 = c;
            }
        }
        answer = max_1 * max_2;
        return answer;
    }
}
