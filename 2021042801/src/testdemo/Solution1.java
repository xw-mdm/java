package testdemo;

import java.util.Stack;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-29
 * Time: 16:11
 */
public class Solution1 {
    public int calPoints(String[] ops) {
        Stack<Integer> s1=new Stack<>();
        int sum=0;
        for (int i = 0; i <ops.length ; i++) {
            if(ops[i].equals("C")){
                s1.pop();
            }else if(ops[i].equals("D")){
                s1.push((2*s1.peek()));
            }else if(ops[i].equals("+")){
                int a=s1.pop();
                int b=s1.peek();
                s1.push(a);
                s1.push(a+b);
            }
            else {
                int h=Integer.valueOf(ops[i]);
                s1.push(h);
            }

        }
        while(!s1.empty()){
            sum+=s1.pop();
        }
        return sum;

    }
}
