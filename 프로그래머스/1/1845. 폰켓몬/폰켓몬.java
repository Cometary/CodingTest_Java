import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        int num = nums.length;
        for(int i=0; i<num; i++){
            set.add(nums[i]);
        }
        int sum = set.size();
        
        answer = sum<num/2 ? sum : num/2;
        
        
        return answer;
    }
}