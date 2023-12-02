class Solution {
    public int[] solution(int n) {
        int size = 1;
        int num = n;
        while(num!=1){
            num = num%2==1 ? 3*num+1 : num/2;
            size++;
        }
        int[] answer = new int[size];
        size = 1;
        answer[0] = n;
        while(n!=1){
            n = n%2==1 ? 3*n+1 : n/2;
            answer[size] = n;
            size++;
        }
        return answer;
    }
}