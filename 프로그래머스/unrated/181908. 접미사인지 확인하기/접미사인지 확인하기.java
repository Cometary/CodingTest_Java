class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        answer = my_string.lastIndexOf(is_suffix)!=-1 && my_string.lastIndexOf(is_suffix)==(my_string.length()-is_suffix.length()) ? 1 : 0; 
        return answer;
    }
}