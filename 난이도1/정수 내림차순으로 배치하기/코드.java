class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        String answer = "";
        int a[] = new int [s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            String c = s.substring(i, i+1);
            a[i] = Integer.parseInt(c);
        }
        
        for(int j = 0; j < s.length()-1; j++){
            for(int i = 0; i < s.length()-1; i++) {
                if (a[i] < a[i+1]) {
                    int tmp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = tmp;
                }
            }
        }
        
        for(int i = 0; i < s.length(); i++) {
            answer += a[i];
        }
        return Long.parseLong(answer);
    }
}
