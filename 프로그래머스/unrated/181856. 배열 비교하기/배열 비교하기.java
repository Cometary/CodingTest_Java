class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 1;
        if(arr1.length<arr2.length){
            answer=-1;
        }else if(arr1.length==arr2.length){
            int rr1 = 0;
            int rr2 = 0;
            for(int a : arr1){
                rr1 += a;
            }
            for(int b : arr2){
                rr2 += b;
            }
            answer = rr1<rr2 ? -1 : (rr1>rr2 ? 1 : 0);
        }
        return answer;
    }
}