class Solution {
    public int solution(long num) {
        int answer = 0;
        for(int i=0;i<500;i++){
            if(num == 1){
                answer = i;
                break;
            }
            else
                answer = -1;            
                num = (num%2==0)?(num/2):(3*num+1);
        }
        return answer;
    }
}