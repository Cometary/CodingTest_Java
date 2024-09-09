import java.math.BigInteger;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 0;
        int b = 1;
        
        for(int i=0; i<n-1; i++){
            if(i%2==0){
                a = (a%1234567+b%1234567)%1234567;
            }else{
                b = (a%1234567+b%1234567)%1234567;
            }
        }
        
        
        answer = n%2==0 ? a%1234567 : b%1234567;
        
        return answer;
    }
}