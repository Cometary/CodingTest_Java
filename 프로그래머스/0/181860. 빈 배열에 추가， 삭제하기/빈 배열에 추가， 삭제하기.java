import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<flag.length; i++){
            if(flag[i]){
                for(int j=0; j<arr[i]*2; j++){
                    list.add(arr[i]);
                }
            }else if(list.size()>0 && !flag[i]){
                for(int j=0; j<arr[i]; j++){
                    list.remove(list.size()-1);
                }
            }
        }
        int size = list.size();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}