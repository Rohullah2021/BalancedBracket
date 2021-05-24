package brackets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
    {

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Character> opening_brackets_stack = new Stack<Character>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
            	opening_brackets_stack.push(next);
            	}

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
            	char type = opening_brackets_stack.peek();
            	Bracket brackete = new Bracket(type, position);
            	if (bracket.Match(next)) {
            		opening_brackets_stack.pop();
            	}
            	else {
            		break;
            	}
            }
        }
       System.out.println(text);
       if (opening_brackets_stack.isEmpty()) {
    	   System.out.println("success");
       }else {
    	   int postion;
		for(int j= 0; j < postion; j++) {
    		   System.out.println(" ");
    	   }
    	   System.out.println("^\n");
    	   int position;
		System.out.println("mismatch @" + (position + 1));
    }
    }
}

    
    

