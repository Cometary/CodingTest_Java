import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String[] my_char = my_string.split("");
        for(int i=0; i<my_char.length; i++){
            for(int j=0; j<indices.length; j++){
                if(i==indices[j]){
                    my_char[i] = "";
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_char.length; i++){
            sb.append(my_char[i]);
        }
        return sb.toString();
    }
}