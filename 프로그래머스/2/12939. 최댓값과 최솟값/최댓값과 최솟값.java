import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a = s.split(" ");
        
        int[] b = new int[a.length];
        
        for(int i=0; i<a.length; i++){
            b[i] = Integer.parseInt(a[i]);
        }
        
        Arrays.sort(b);
        
        
        
        answer = b[0]+" "+b[b.length-1];
        
        return answer;
    }
}