class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<my_string.length();i++){
            char a = my_string.charAt(i);
            
            if('a'<= a && 'z' >= a){
                sb.append(Character.toUpperCase(a));
            }
            else{
                sb.append(Character.toLowerCase(a));
            }
        }
        return sb.toString();
    }
}