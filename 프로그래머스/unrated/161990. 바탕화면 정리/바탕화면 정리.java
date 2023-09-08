class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {wallpaper.length, wallpaper[0].length(), 0, 0};
		// answer[0] #이 존재하는 제일 작은 i
		// answer[1] 제일 작은 #의 index
		// answer[2] #이 존재하는 제일 큰 i+1
		// answer[3] 제일 큰 #의 index +1
		
		for(int i=0; i<wallpaper.length; i++) {
			if(wallpaper[i].indexOf("#")>=0) {
				if(answer[0]>i) {
					answer[0] = i;
				}
				if(answer[1]>wallpaper[i].indexOf("#")) {
					answer[1]= wallpaper[i].indexOf("#");
				}
				if(answer[2]-1<i) {
					answer[2] = i+1;
				}
			}
			if(wallpaper[i].lastIndexOf("#")>=0) {
				if(answer[3]-1<wallpaper[i].lastIndexOf("#")) {
					answer[3] = wallpaper[i].lastIndexOf("#")+1;
				}
			}
		}
		
        return answer;
    }
}