import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dot = s.nextInt();
        String[][] arr = new String[dot][2];

        for(int i=0;i<dot;i++){
            arr[i][0] = s.next();
            arr[i][1] = s.next();
        }
        Arrays.sort(arr,(e1,e2) ->{
            return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
        });
        for (int i = 0; i < dot; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
