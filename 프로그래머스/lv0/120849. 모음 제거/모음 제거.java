import java.util.*;

class Solution {
    public String solution(String my_string) {
       
      String[] my_array = Arrays.stream(my_string.split(""))
            .filter(a -> !"aeiou".contains(a))
            .toArray(String[] :: new);
          return String.join("",my_array);    
    }
}