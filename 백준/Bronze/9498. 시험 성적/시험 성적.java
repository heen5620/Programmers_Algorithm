import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        if (number >= 90) {
            System.out.println("A");
        } else if (number >= 80) {
            System.out.println("B");
        } else if (number >= 70) {
            System.out.println("C");
        } else if (number >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
