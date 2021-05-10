package testdemo;

import java.util.Stack;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-29
 * Time: 16:45
 */
public class IsPopOrder1 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> push=new Stack<>();
        int j=0;
        for (int i = 0; i <pushA.length ; i++) {
            push.push(pushA[i]);
            while(!push.empty()&&push.peek()==popA[j]){
                push.pop();
                j++;
            }
        }
        return  push.empty();
    }
}
