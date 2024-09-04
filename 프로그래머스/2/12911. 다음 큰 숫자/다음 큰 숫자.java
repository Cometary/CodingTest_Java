class Solution {
    public int solution(int n) {
        int answer = 0;
        int one=0;
        int sum=-1;
        boolean start = true;
        String bi;
        
        while(one!=sum){
            if(start){
                bi = Integer.toBinaryString(n++);
                bi = bi.replace("0", "");
                one = bi.length();
                start= false;
                continue;
            }
            bi = Integer.toBinaryString(n++);
            bi = bi.replace("0", "");
            sum = bi.length();
        }
        answer=n-1;
        
        
        return answer;
    }
}