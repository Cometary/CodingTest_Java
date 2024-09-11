import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        char[] c = s.toCharArray();
        int index = c.length;
        Stack<Character> stackInt = new Stack<>();
        
        
        for(int i=0; i<index; i++){
            if(stackInt.isEmpty()){
                stackInt.push(c[i]);
            }else if(stackInt.peek()==c[i]){
                stackInt.pop();
            }else{
                stackInt.push(c[i]);
            }
        }
        if(stackInt.isEmpty()){
            answer = 1;
        }
        
        return answer;
    }
}