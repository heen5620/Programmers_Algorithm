class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        String p = "p";
        String y = "y";
        
        int p_count = 0;
        int y_count = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(p.equals(String.valueOf(s.charAt(i)))) {
                p_count++;
            }
            else if(y.equals(String.valueOf(s.charAt(i)))) {
                y_count++;
            }
        }
        
        if(p_count == y_count) {
            answer = true;
        }
        else {
            answer = false;
        }
        return answer;
    }
}
