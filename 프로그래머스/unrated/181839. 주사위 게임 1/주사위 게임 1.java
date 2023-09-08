class Solution {
    public int solution(int a, int b) {
        int answer = a%2==1 || b%2==1 ? (a%2==1 && b%2==1 ? (int)Math.pow(a,2)+(int)Math.pow(b,2) : 2*(a+b)) : Math.abs(a-b);
        return answer;
    }
}