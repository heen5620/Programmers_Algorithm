import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        double num1 = Integer.parseInt(st.nextToken());
        double num2 = Integer.parseInt(st.nextToken());

        System.out.println(num1 / num2);




    }
}