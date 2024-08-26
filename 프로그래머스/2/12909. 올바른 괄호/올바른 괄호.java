class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int temp = 0;
        
        char[] c = s.toCharArray();
        
        for(char a : c){
            switch(a){
                case '(':
                    temp++;
                    break;
                case ')':
                    temp--;
                    break;
            }
            if(temp<0){
                return false;
            }
        }

        if(temp!=0){
            return false;
        }
        
        return answer;
    }
}