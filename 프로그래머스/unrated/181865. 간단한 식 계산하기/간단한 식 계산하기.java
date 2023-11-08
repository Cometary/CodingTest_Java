class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] bi = binomial.split(" ");
        switch(bi[1]){
            case "+" :
                answer = Integer.parseInt(bi[0])+Integer.parseInt(bi[2]);
                break;
            case "-" :
                answer = Integer.parseInt(bi[0])-Integer.parseInt(bi[2]);
                break;
            default :
                answer = Integer.parseInt(bi[0])*Integer.parseInt(bi[2]);
                break;
        }
        return answer;
    }
}