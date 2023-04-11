class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        
        for(int i=0;i<cipher.length();i++){
            if((1+i) % code == 0){
                answer+=cipher.charAt(i);
            }
        }
        
        return answer;
    }
}