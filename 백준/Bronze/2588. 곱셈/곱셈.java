import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int sum = 0;
        int a = num1* ((num2 % 100) % 10);
        int b = num1* ((num2 % 100) / 10);
        int c = num1 * (num2 / 100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(num1 * num2);

    }
}