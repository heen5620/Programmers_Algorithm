import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            sb.append(push(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }

    public static String push(String a){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if(c == '('){
                stack.push(c);

            } else if (stack.isEmpty()) {
                return "NO";
            }else {
                stack.pop();
            }

        }

        if (stack.isEmpty()){
            return "YES";
        }
        else {
            return "NO";
        }
    }
}