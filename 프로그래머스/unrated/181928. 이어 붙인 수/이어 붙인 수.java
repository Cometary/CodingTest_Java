class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        // 10ms
        // String odd = "";
        // String even = "";
        // for(int num : num_list){
        //     if(num%2==0){
        //         even += num;
        //     }else{
        //         odd += num;
        //     }
        // }
        // answer = Integer.parseInt(odd)+Integer.parseInt(even);
        int even = 0;
        int odd = 0;

        for(int num : num_list) {
            if(num % 2 == 0) {
                even *= 10;
                even += num;
            } else {
                odd *= 10;
                odd += num;
            }
        }
        answer = even + odd;
        return answer;
    }
}