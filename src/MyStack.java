import java.util.Stack;

public class MyStack {
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> tmp = new Stack<>();
        while (!s.isEmpty()) {
            int val = s.pop();
            while (!tmp.isEmpty() && tmp.peek() > val) s.push(tmp.pop());
            tmp.push(val);
        }
        return tmp;
    }
}