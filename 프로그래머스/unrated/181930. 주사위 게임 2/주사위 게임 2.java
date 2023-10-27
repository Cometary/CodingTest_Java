class Solution {
    public int solution(int a, int b, int c) {
        int answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        if(a!=b || a!=c || b!=c){
            answer /= a*a*a+b*b*b+c*c*c;
        }
        if(a!=b && a!=c && b!=c){
            answer /= a*a+b*b+c*c;
        }
        return answer;
    }
}