class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int a=0;
        
        for(int i=1;i<=n;i++){
            answer[a] = (long)x*i; 
            a++;
        }
        
        return answer;
    }
}