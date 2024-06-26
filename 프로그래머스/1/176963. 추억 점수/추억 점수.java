import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        
        HashMap<String, Integer> miss = new HashMap<String, Integer>();
        
        int num = name.length;
        for(int i=0; i<num; i++){
            miss.put(name[i], yearning[i]);
        }
        
        num = photo.length;
        int[] answer = new int[num];
        int temp;
        
        for(int i=0; i<num; i++){
            temp = 0;
            for(String a : photo[i]){
                if(miss.containsKey(a)){
                    temp += miss.get(a);
                }
            }
            answer[i] = temp;
        }
        
        return answer;
    }
}