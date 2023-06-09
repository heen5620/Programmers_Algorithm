import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dot = s.nextInt();
        int[][] arr = new int[dot][2];

        for(int i=0;i<dot;i++){
            arr[i][0] = s.nextInt();
            arr[i][1] = s.nextInt();
        }
        Arrays.sort(arr,(e1,e2)->{
            if(e1[1] == e2[1]){
                return e1[0] - e2[0];
            }
            return e1[1] - e2[1];
        });
        for(int i=0;i<dot;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
