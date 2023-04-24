import java.util.*;
class Solution {
    public int[] solution(long n) {
        int[] array = new int[String.valueOf(n).length()];
        
        for(int i=0;i<array.length;i++){
            array[i] = (int)(n%10);
            n = (int)(n/10);
        }
        
        return array;
    }
}