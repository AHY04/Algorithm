import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> a = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            a.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(a);
        
        for(int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i).substring(1, a.get(i).length());
        }
        return answer;
    }
}
