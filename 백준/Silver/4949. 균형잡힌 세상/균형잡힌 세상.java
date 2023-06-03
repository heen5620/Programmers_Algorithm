import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;

        while (!(line = br.readLine()).equals(".")) {
            sb.append(isBalanced(line)).append('\n');
        }
        System.out.println(sb);
    }

    public static String isBalanced(String line) {
        Stack<Character> stack = new Stack<>();

        for (int i=0;i<line.length();i++) {
            char c = line.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == ']') {
                if (stack.isEmpty()) {
                    return "no";
                } else if ((c == ')' && stack.peek() == '(') || (c == ']' && stack.peek() == '[')) {
                    stack.pop();
                } else {
                    return "no";
                }
            }
        }

        if (stack.isEmpty()) {
            return "yes";
        } else {
            return "no";
        }
    }
}
