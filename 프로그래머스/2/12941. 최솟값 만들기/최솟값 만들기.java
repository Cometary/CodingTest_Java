import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        int leng = A.length;
        
        for(int i=0; i<leng; i++){
            answer+= A[i] * B[leng-1-i];
        }

        return answer;
    }
}