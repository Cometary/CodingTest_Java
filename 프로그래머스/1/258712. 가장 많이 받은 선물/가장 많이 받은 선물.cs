using System;

public class Solution {
    public int solution(string[] friends, string[] gifts) {
        int number = friends.Length;
        int[,] GiveNTake = new int[number,number];
        string[] tempS;
        int x;
        int y;
        foreach(string gift in gifts){
            tempS = gift.Split(' ');
            x = Array.IndexOf(friends,tempS[0]);
            y = Array.IndexOf(friends,tempS[1]);
            GiveNTake[x,y]++;
        }
        int[,] Point = new int[number,3];
        for(int i=0; i<number; i++){
            for(int j=0; j<number; j++){
                Point[i,0] += GiveNTake[i,j];
                Point[j,1] += GiveNTake[i,j];
            }
        }
        for(int i=0; i<number; i++){
            Point[i,2] = Point[i,0] - Point[i,1];
        }
        int[] Next = new int[number];
        for(int i=0; i<number; i++){
            for(int j=i; j<number; j++){
                if(i!=j){
                    if(GiveNTake[i,j] == GiveNTake[j,i]){
                        if(Point[i,2]!=Point[j,2]){
                        Next[Point[i,2]>Point[j,2] ? i : j]++;}
                    }else{
                        Next[GiveNTake[i,j] > GiveNTake[j,i] ? i : j]++;
                    }
                }
            }
        }
        int answer = 0;
        for(int i=0; i<number; i++){
            if(Next[i]>answer){
                answer = Next[i];
            }
        }
        return answer;
    }
}