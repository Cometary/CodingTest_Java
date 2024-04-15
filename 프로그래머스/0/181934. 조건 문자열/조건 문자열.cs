using System;

public class Solution {
    public int solution(string ineq, string eq, int n, int m) {
        int answer = 0;
        if(n==m && eq=="="){
            answer = 1;
        }
        if(n-m<0 && ineq=="<"){
            answer = 1;
        }
        if(n-m>0 && ineq==">"){
            answer = 1;
        }
        return answer;
    }
}