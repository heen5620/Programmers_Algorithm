
class Solution {
    public String solution(int n) {
        String melon = "수박";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n;i++){
            sb.append(melon.charAt(0));
            if(sb.length() == n) break;
            sb.append(melon.charAt(1));
            if(sb.length() == n) break;
        }
        return sb.toString();
    }
}