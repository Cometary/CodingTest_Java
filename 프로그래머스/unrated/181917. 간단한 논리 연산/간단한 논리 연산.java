class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = 
            ((x1==false && x2==false) ? false : true)==true &&
            ((x3==false && x4==false) ? false : true)==true
            ? true : false
            ;
        return answer;
    }
}