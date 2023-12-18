import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> ar = new ArrayList<String>();
        for(int i=0; i<my_string.length(); i++){
            ar.add(my_string.substring(i,my_string.length()));
        }
        Collections.sort(ar);
        String[] answer = ar.toArray(new String[ar.size()]);
        return answer;
    }
}