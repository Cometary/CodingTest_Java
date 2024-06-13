import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int a : arr){
            list.add(a);
        }
        
        for(int a : delete_list){
            list.remove(Integer.valueOf(a));
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}