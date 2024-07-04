class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int num = nums.length;
        int temp;
        
        for(int a=0; a<num-2; a++){
            for(int b=a+1; b<num-1; b++){
                for(int c=b+1; c<num; c++){
                  temp = nums[a]+nums[b]+nums[c];
                    for(int d=2; d<temp; d++){
                        if(temp%d==0){
                            break;
                        }
                        if(d==temp-1 && temp%d!=0){
                            answer++;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}