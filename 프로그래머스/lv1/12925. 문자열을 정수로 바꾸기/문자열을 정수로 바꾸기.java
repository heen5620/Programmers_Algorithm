class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            sb.append(s.charAt(i)); 
        }
        String str= sb.toString();
        answer = Integer.parseInt(str);
        return answer;
    }
}