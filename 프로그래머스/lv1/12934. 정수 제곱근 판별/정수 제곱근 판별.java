class Solution {
    public long solution(long n) {
        long answer = 0;
        long b = (long)(Math.sqrt(n));
        if(b*b == n){
            answer = (b+1) * (b+1); 
        }
        else{
            answer = -1;
        }
        return answer;
    }
}