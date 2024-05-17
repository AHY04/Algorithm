class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int j = 0;
        for(int[] query:queries){
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int min = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k && arr[i] < min) {
                    min = arr[i];
                }
            }
            if(min == Integer.MAX_VALUE){
                answer[j] = -1;
            }
            else {
                answer[j] = min;
            }
            j++;
        }
        return answer;
    }
}
