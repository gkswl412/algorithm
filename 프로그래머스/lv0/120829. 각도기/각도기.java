class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0) {
            answer++;
        }
        
        if(angle >= 90) {
            answer++;
        }
        
        if(angle > 90) {
            answer++;
        }
        
        if(angle == 180) {
            answer++;
        }
        
        return answer;
    }
}