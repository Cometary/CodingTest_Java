using System;

public class Solution {
    public int[] solution(string my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.Length; i++){
            answer[(int)my_string[i]<91 ? (int)my_string[i]-65 : (int)my_string[i]-65-6]++;
            Console.Write((int)my_string[i]+" ");
        }
        return answer;
    }
}