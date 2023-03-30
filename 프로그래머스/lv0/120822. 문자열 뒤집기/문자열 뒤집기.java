class Solution {
    public String solution(String my_string) {
        
        StringBuffer answer = new StringBuffer(my_string);
        
        String reverse = answer.reverse().toString();
        
        return reverse;
    }
}