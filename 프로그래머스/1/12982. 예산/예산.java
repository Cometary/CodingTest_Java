class Solution {
    public int solution(int[] d, int budget) {
        int answer =0;
		java.util.Arrays.sort(d);
		for(int i=0; i<d.length; i++) {
            answer+= d[i];
            if(answer>budget){
                answer=i;
                break;
            }
            if(i==d.length-1){
                answer=d.length;
            }
		}
        return answer;
    }
}