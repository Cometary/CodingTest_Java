class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int attack;
        int exit;
        int temp;
        int half;
        
        for(int i=1; i<=number; i++){
            if(i==1){
                answer++;
                continue;
            }
            exit=0;
            half= i/2;
            temp=0;
            for(int j=1; j<=half; j++){  
                if(i%j==0){
                    if(i/j<j){
                        break;
                    }
                    temp+= i/j == j ? 1 :2;
                    exit+=i/j == j ? 1 :2;
                }
                if(exit>limit){
                    temp = power;
                    break;
                }
            }
            answer+=temp;
        }
        
        return answer;
    }
}