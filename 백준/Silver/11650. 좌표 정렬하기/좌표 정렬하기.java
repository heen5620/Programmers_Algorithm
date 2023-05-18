import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dot = s.nextInt();
        int[][] array = new int[dot][2];

        for(int i=0;i<dot;i++){
            array[i][0] = s.nextInt();
            array[i][1] = s.nextInt();
        }
        Arrays.sort(array,(e1,e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            }
            return e1[0]- e2[0];
        });

        for(int i=0;i<dot;i++){
            System.out.println(array[i][0] + " " + array[i][1]);
        }
    }
}
