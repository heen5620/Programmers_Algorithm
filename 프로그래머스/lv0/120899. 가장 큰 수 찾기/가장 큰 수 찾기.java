import java.util.Arrays;
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max_num = 0;
        int index = 0;
        
        for(int i=0;i<array.length;i++){
            if(max_num < array[i]){
                max_num = array[i];
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i] == max_num){
                index = i;
            }
        }
        
        
        answer[0] = max_num;
        answer[1] = index;
        return answer;
    }
}