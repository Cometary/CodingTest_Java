import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            if(str.indexOf("ad")==-1){
                sb.append(str+" ");
            }
        }
        String[] answer = sb.toString().trim().split(" ");
        return answer;
    }
}