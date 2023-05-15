import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(String aList : arr) sb.append(aList);
        
        
        return Long.parseLong(sb.reverse().toString());
    }
}