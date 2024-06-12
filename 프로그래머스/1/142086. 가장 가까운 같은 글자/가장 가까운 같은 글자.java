class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] answer = new int[size];
        answer[0] = -1;
        char tempchar;
        int tempanswer;
        for(int i=1; i<size; i++){
            tempchar = s.charAt(i);
            tempanswer = s.lastIndexOf(tempchar, i-1);
            if(tempanswer != -1){
                answer[i] = i - tempanswer;
            }else{
                answer[i] = tempanswer;
            }
        }
        return answer;
    }
}