class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int num=0;
        int temp;
        int size = section.length;
        int i = section[num];
        
        while(i<=section[size-1]){
            System.out.println(i);
            answer++;
            num++;//section의 index
            i+=m;
            for(int j=num; j<size; j++){
                if(section[j]>=i){
                    i = section[j];
                    num=j-1;
                    break;
                }
            }
            
            //i = m을 더한 이후의 다음 section
        }
        
        return answer;
    }
}