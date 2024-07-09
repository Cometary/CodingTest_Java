class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int temp;
        
        for(String ba : babbling){
            ba = ba.replaceAll("aya","1");
            ba = ba.replaceAll("ye","2");
            ba = ba.replaceAll("woo","3");
            ba = ba.replaceAll("ma","4");
            
            try{
                temp = Integer.parseInt(ba);
                if(ba.indexOf("11")==-1 && ba.indexOf("22")==-1 && ba.indexOf("33")==-1 && ba.indexOf("44")==-1){ answer++;
                    
                }
            }catch(Exception e){
                
            }
        }
        
        return answer;
    }
}