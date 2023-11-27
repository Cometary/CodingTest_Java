class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0, y = 0;
        boolean xy = true; // true : y+, false : x+
        boolean pm = true; // true : +, false : -
        int standard = n;
        int num = n;
        for(int i=1; i<=n*n; i++){
            answer[x][y] = i;
            num--;
            if(num==0){
                xy = !xy;
                if(!xy){
                    standard -= 1;
                }else{
                    pm = !pm;
                }
                num = standard;
            }
            x = xy ? (x) : (x += pm ? 1 : -1);
            y = xy ? (y += pm ? 1 : -1) : (y);
        }
        return answer;
    }
}