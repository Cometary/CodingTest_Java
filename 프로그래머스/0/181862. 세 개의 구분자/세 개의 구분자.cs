using System;
using System.Linq;
using System.Collections.Generic;

public class Solution {
    public string[] solution(string myStr) {
        string[] answer = myStr.Split('a', 'b', 'c');
        answer = answer.Where(x => !string.IsNullOrEmpty(x)).ToArray();
        if(answer.Length==0){
            answer = new string[]{"EMPTY"};
        }
        return answer;
    }
}