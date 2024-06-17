import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger answer;
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        answer = bigA.add(bigB);
        
        return answer.toString();
    }
}