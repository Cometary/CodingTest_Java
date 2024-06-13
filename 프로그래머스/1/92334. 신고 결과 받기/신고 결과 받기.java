import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        report = Arrays.stream(report).distinct().toArray(String[]::new);
        int[] countdown = new int[id_list.length];
        
        String[] request = new String[report.length];
        String[] response = new String[report.length];
        String[] temp = new String[2];
        
        for(int i=0; i<report.length; i++){
            temp = report[i].split(" ");
            request[i] = temp[0];
            response[i] = temp[1];
            countdown[Arrays.asList(id_list).indexOf(response[i])]++;;
        }
        
        for(int i=0; i<countdown.length; i++){
            if(countdown[i]>=k){
                for(int j=0; j<report.length; j++){
                    if(response[j].equals(id_list[i])){
                        answer[Arrays.asList(id_list).indexOf(request[j])]++;
                    }
                }
            }
        }
        
        return answer;
    }
}