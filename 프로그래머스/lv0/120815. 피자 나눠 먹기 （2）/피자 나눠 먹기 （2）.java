class Solution {
    public static int gcd(int a, int b){
        
        int temp = a % b;
        
        if(temp == 0){
            return b;
        }
        else{
            return gcd(b, temp);
        }
    }
    
    public int solution(int n) {
        int answer = 0;
        
        answer = ((n*6) / gcd(n, 6)) / 6;
        
        return answer;
    }
}