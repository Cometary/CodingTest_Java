import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        Stack<Integer> s1 = new Stack<>();
        
        char[] temp = sc.nextLine().toCharArray();
        int leng;
        boolean judge;
        
        while(temp.length!=1 && temp[0]!='.'){
            leng = temp.length;
            judge = true;
            s1 = new Stack<>();
            
            for(int i=0; i<leng; i++){
                switch(temp[i]){
                    case '[':
                        s1.push(1);
                        break;
                    case ']':
                        if(s1.isEmpty()){judge = false;}
                        else{
                            int t = s1.pop();
                            if(t!=1){
                                judge = false;
                            }
                        }
                        break;
                    case '(':
                        s1.push(2);
                        break;
                    case ')':
                        if(s1.isEmpty()){judge = false;}
                        else{
                            int t = s1.pop();
                            if(t!=2){
                                judge = false;
                            }
                        }
                        break;
                }
                if(!judge){
                    break;
                }
            }
            if(s1.isEmpty()){
                if(judge){
                    sb.append("yes\n");
                }else{
                    sb.append("no\n");
                }    
            }else{
                sb.append("no\n");
            }
            
            
            temp = sc.nextLine().toCharArray();
        }
        
        System.out.println(sb);
    }
}