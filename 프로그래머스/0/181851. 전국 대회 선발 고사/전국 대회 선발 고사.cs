using System;

public class Solution {
    public int solution(int[] rank, bool[] attendance) {
        int answer = 0;
        int[] temp = new int[rank.Length];
        Array.Copy(rank,0,temp,0,temp.Length);
        int[] a = new int[3];
        for(int i=0; i<rank.Length; i++){
            if(!attendance[i]){
                rank[i]=101;
            }
        }
        Array.Sort(rank);
        for(int i=0; i<3; i++){
            a[i] = Array.IndexOf(temp, rank[i]);
        }
        answer = a[0]*10000+a[1]*100+a[2];
        return answer;
    }
}