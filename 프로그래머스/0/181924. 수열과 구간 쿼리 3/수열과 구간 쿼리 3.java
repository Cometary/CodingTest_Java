class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int[] que : queries){
            int a = arr[que[0]];
            int b = arr[que[1]];
            arr[que[0]] = b;
            arr[que[1]] = a;
        }
        return arr;
    }
}