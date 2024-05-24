class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int hitNum = attacks.length;
        int timeLimit = attacks[hitNum-1][0];
        int bossTurn = 0;
        int combo = 0;
        
        for(int i=1; i<=timeLimit; i++){
            if(i==attacks[bossTurn][0]){
                answer-=attacks[bossTurn++][1];
                combo=0;
            }else{
                answer+=bandage[1];
                combo++;
                if(combo==bandage[0]){
                    answer+=bandage[2];
                    combo=0;
                }
            }
            if(answer>health){
                answer=health;
            }
            if(answer<1){
                return -1;
            }
        }
        
        return answer;
    }
}