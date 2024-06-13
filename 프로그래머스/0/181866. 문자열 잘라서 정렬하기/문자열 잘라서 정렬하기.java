import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String myString) {
        String[] answer;
        String[] temp;
        ArrayList<String> list = new ArrayList<String>();
        
        temp = myString.split("x");
        
        for(int i=0; i<temp.length; i++){
            if(temp[i].length()>0){
                list.add(temp[i]);
            }
        }
        
        answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
        return answer;
    }
}