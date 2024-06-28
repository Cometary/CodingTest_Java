import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        HashMap<String, Integer> pam = new HashMap<String, Integer>();
        
        int num = players.length;
        
        String[] answer = new String[num];
        
        for(int i=0; i<num; i++){
            map.put(i,players[i]);
            pam.put(players[i],i);
        }
        
        int target;
        String down;
        
        for(int i=0; i<callings.length; i++){
            target = pam.get(callings[i]);
            down = map.get(target-1);
            map.replace(target-1, callings[i]);
            map.replace(target, down);
            pam.replace(callings[i],target-1);
            pam.replace(down, target);
        }
        
        for(int i=0; i<num; i++){
            answer[i] = map.get(i);
        }
        
        return answer;
    }
}