package testdemo;

import java.util.Stack;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-29
 * Time: 17:15
 */
public class evalRPN1 {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack1=new Stack<>();
            for (int i = 0; i <tokens.length ; i++) {
                switch(tokens[i]){
                    case "+":
                        stack1.push(stack1.pop()+stack1.pop());
                        break;
                    case "-":
                        stack1.push(-(stack1.pop()-stack1.pop()));
                        break;
                    case "*":
                        stack1.push(stack1.pop()*stack1.pop());
                        break;
                    case "/":
                        int a=stack1.pop();
                        stack1.push(stack1.pop()/a);
                        break;
                    default:
                        stack1.push(Integer.valueOf(tokens[i]));

                }

            }
            return stack1.pop();

        }

}
