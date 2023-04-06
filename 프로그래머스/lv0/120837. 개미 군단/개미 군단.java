class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int a = hp / 5;
        int a_1 = hp % 5;
        
        int b = a_1 / 3;
        int b_1 = a_1 % 3;
        
        int c = b_1 / 1;
        int c_1 = b_1 % 1;
        
        if(a_1 == 0){
            answer = a;
        }
        else if(b_1 == 0){
            answer = a+b;
        }
        else if(c_1 == 0){
            answer = a+b+c;
        }
          
        return answer;
    }
}