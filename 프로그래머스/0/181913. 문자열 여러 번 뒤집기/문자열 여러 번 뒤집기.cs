using System;

public class Solution {
    public string solution(string my_string, int[,] queries) {
        char[] temp = my_string.ToCharArray();
        for(int i=0; i<queries.GetLength(0); i++){
            Array.Reverse(temp,queries[i,0],queries[i,1]-queries[i,0]+1);
        }
        my_string = new string(temp);
        return my_string;
    }
}