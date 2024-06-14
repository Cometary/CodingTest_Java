import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        
        for(String part : participant){
            hash.put(part, hash.getOrDefault(part, 0)+1);
        }
        for(String comp : completion){
            hash.put(comp, hash.getOrDefault(comp, 0)-1);
        }
        
        for (String key : hash.keySet()) {
	            if (hash.get(key) != 0){
	            	answer += key;
	            }
	        }
        
        
        return answer;
    }
}