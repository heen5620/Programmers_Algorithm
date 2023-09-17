import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] arr = a.toCharArray();
        
        for(int i=0; i<arr.length;i++){
            if(65 <= arr[i] && arr[i] <= 90){
                arr[i] = (char)(arr[i] + 32);
                continue;
            }
            if(97<= arr[i] && arr[i] <= 122){
                arr[i] = (char) (arr[i]-32);
                continue;
            }
        }
        System.out.println(arr);
    }
}