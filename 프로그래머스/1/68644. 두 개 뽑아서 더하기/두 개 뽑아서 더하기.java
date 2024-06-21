import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> a = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                a.add(numbers[i]+numbers[j]);
            }
        }
        a = a.stream().distinct().sorted().collect(Collectors.toList());
        
       answer = a.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}