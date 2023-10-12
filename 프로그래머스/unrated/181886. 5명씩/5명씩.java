class Solution {
    public String[] solution(String[] names) {
        int num = names.length;
        int leng = (names.length-1)/5 +1;
        String[] answer = new String[leng];
        for(int i=0; i<num; i+=5){
            answer[i/5] = names[i];
        }
        return answer;
    }
}