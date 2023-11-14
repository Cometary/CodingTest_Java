class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int num = 0;
        for(boolean fi : finished){
            num += fi==false ? 1 : 0;
        }
        String[] answer = new String[num];
        num = 0;
        for(int i=0; i<todo_list.length; i++){
            if(finished[i]==false){
                answer[num] = todo_list[i];
                num++;
            }
        }
        return answer;
    }
}