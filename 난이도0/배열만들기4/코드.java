import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> stk = new ArrayList<Integer>();
        for(int i =0; i < arr.length;) {
            if(stk.size() == 0) {
                stk.add(arr[i]);
                i += 1;
            }
            else if(stk.get(stk.size() - 1) < arr[i]){
                stk.add(arr[i]);
                i += 1;
            }
            else {
                stk.remove(stk.get(stk.size() - 1));
            }
        }
        return stk;
    }
}
