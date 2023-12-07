import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        String[] st = my_string.split("");
        for(int i=c-1; i<my_string.length(); i+=m){
            sb.append(st[i]);
        }
        String answer = sb.toString();
        return answer;
    }
}