class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int index = 0;
        int a = 0;
        int b = 0;
        char[] c;
        
        while(!s.equals("1")){
            c= s.toCharArray();
            for(char h : c){
                switch(h){
                    case '1':
                        a++;
                        break;
                    case '0':
                        b++;
                        break;
                }
            }
            s = Integer.toBinaryString(a);
            a=0;
            index++;

        }
        
        answer[0] = index;
        answer[1] = b;
        
        return answer;
    }
}