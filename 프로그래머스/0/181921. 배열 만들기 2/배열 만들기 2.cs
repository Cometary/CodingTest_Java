using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int l, int r) {
        List<int> list = new List<int>();
        int start = 0;
        int temp;
        bool bttn = true;
        if(l%5==0){
            start=l;
        }else{
            start = l+ 5 - (l%5);
        }
        for(int i=start; i<=r; i+=5){
            temp=i;
            bttn =true;
            while(temp>0){
                if(temp%10!=5 && temp%5!=0){
                    bttn=false;
                    break;
                }
                temp/=10;
            }
            if(bttn){
                list.Add(i);
            }
        }
        if(list.Count==0){
            list.Add(-1);
        }
        int[] answer = list.ToArray();
        
        return answer;
    }
}