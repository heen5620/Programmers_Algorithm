class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int a = 1;
        for(int i=0;i<answer.length;i++){
            answer[i] = x*(long)a;
            a++;
        }
        return answer;
    }
}