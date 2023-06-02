class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for(int i=0;i<s.length();i++){
            if(s.length() % 2 == 0){
                sb.append(s.charAt(s.length()/2-1));
                sb.append(s.charAt(s.length()/2));
                break;
                
            }
            else{
                sb.append(s.charAt(s.length() / 2));
                break;
            }
        }
        
        return sb.toString();
    }
}