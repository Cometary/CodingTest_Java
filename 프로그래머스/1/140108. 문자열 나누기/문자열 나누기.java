class Solution {
    public int solution(String s) {
        int answer = 0;
        int size = s.length();
        char st = s.charAt(0);
        char ta;
        int x=0;
        
        for(int i=0; i<size; i++){
            x += s.charAt(i)==st ? 1 : -1;
            
            if(x==0 && i<size-1){
                answer++;
                st = s.charAt(i+1);
                
            }else if(x==0 && i==size-1){
                answer++;
            }else if(i==size-1){
                answer++;
            }
        }
        
        return answer;
    }
}