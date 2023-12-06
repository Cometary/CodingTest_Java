class Solution {
    public int solution(int[][] board, int k) {
        int x = board.length;
        int y = board[0].length;
        int answer = 0;
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(i+j<=k){
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}