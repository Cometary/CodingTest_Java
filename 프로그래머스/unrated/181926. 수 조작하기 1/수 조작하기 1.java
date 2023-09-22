class Solution {
    public int solution(int n, String control) {
        String[] con = control.split(""); 
		
		for(String co : con) {
			switch (co) {
			case "w":
				n += 1;
				break;
			case "s":
				n -= 1;
				break;
			case "a":
				n -= 10;
				break;
			default:
				n += 10;
				break;
			}
		}
        return n;
    }
}