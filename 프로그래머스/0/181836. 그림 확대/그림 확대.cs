using System;

public class Solution {
    public string[] solution(string[] picture, int k) {
        string dot = "";
        string ex = "";
        string[] temp = new string[picture.Length*k];
        for(int i=0; i<k; i++){
            dot+=".";
            ex+="x";
        }
        int index=0;
        for(int i=0; i<picture.Length; i++){
            for(int j=0; j<k; j++){
            temp[index++] = picture[i].Replace(".",dot).Replace("x",ex);
        }
        }
        return temp;
    }
}