import java.util.HashMap;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        HashMap<String, Boolean> map = new HashMap<String, Boolean>();
        
        int x = park.length;
        int y = park[0].length();
        
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(park[i].charAt(j)!='X'){
                    map.put(i+","+j, true);
                }
                if(park[i].charAt(j)=='S'){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        
        int num = routes.length;
        String[] temp;
        int[] tran = new int[2];
        
        for(int i=0; i<num; i++){
            temp = routes[i].split(" ");
            System.arraycopy(answer, 0, tran, 0, 2);
            for(int j=0; j<Integer.parseInt(temp[1]); j++){
                switch(temp[0]){
                    case "N":
                        tran[0]-=1;
                        break;
                    case "S":
                        tran[0]+=1;
                        break;
                    case "W":
                        tran[1]-=1;
                        break;
                    case "E":
                        tran[1]+=1;
                        break;
                }
                if(!map.containsKey(tran[0]+","+tran[1])){
                    System.arraycopy(answer, 0, tran, 0, 2);
                    break;
                }
            }
            System.arraycopy(tran, 0, answer, 0, 2);
            
        }
        
        return answer;
    }
}