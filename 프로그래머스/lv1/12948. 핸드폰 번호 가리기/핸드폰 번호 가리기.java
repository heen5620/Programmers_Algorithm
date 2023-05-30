class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder(phone_number);
        char ch = '*';
        
        for(int i =0;i<sb.length()-4;i++){
            sb.setCharAt(i,ch);
            // answer = sb.toString();
        }
        return sb.toString();
    }
}