import java.util.*;
import java.io.*;

public class StackWithMax {
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        int queries = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        public void push(int x)
        {
            if (isEmpty() == true) {
                super.push(x);
                max.push(x);
            }
            else {
                super.push(x);
                int y = min.pop();
                min.push(y);
                if (x < y)
                    min.push(x);
                else
                    min.push(y);
            }
        }
        public Integer pop()
        {
            int x = super.pop();
            min.pop();
            return x;
        }
        public Integer push() {
        	int x = super.push();
        	max.push();
        	return x;
        }

        for (int qi = 0; qi < queries; ++qi) {
            String operation = scanner.next();
            if ("push".equals(operation)) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if ("pop".equals(operation)) {
                stack.pop();
            } else if ("max".equals(operation)) {
                System.out.println(Collections.max(stack));
            }
        }
    }

    static public void main(String[] args) throws IOException {
        new StackWithMax().solve();
    }
}
