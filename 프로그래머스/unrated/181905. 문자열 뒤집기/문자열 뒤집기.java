import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] string = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s; i++){
            sb.append(string[i]);
        }
        for(int i=e; i>=s; i--){
            sb.append(string[i]);
        }
        if(my_string.length()-1>e){
            for(int i=e+1; i<my_string.length(); i++){
                sb.append(string[i]);
            }
        }
        String answer = sb.toString();
        return answer;
    }
}