class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        answer = myString.toLowerCase().indexOf(pat.toLowerCase())!=-1 ? 1 : 0;
        return answer;
    }
}