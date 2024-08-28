

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        char[] ca = s.toCharArray();
        int index = 0;
        for(char c : ca){
            if(index == 0){
                sb.append((c+"").toUpperCase());
            }else{
                sb.append((c+"").toLowerCase());
            }
            if(c==' '){
                index=0;
            }else{
                index=1;
            }
        }
        answer = sb.toString();
        return answer;
    }
}