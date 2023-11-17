class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String pet = "";
        for(int i=0; i<pat.length(); i++){
            pet += pat.charAt(i)=='A' ? "B" : "A";
        }
        answer = myString.contains(pet) ? 1 : 0;
        return answer;
    }
}