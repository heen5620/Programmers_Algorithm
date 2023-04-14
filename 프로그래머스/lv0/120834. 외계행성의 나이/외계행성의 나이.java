import java.util.Arrays;
class Solution {
    public String solution(int age) {
        String trans = Integer.toString(age);
        String[] translate = trans.split("");
        int[] ageArray = new int[translate.length];
        
        for(int a=0;a<translate.length;a++){
            ageArray[a] = Integer.parseInt(translate[a]); 
        }
      
        String[] alphabet = new String[26];
        for(int i=0;i<alphabet.length;i++){
            alphabet[i] = String.valueOf((char)('a' + i)); //문자열 배열 안에 a-z까지 넣음
        }
        
        String[] answer = new String[ageArray.length];
        
        for(int j=0;j<ageArray.length;j++){
            answer[j] = alphabet[ageArray[j]];
        }
        StringBuilder sb = new StringBuilder();
        for(String s : answer){
            sb.append(s);
        }
        
        return sb.toString();
      
    }
}