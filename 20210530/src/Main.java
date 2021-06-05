/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-30
 * Time: 19:23
 */
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int f1=0;
        int f2=1;
        int f3=0;
        while(n>f3){
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        f2=f1;

        System.out.println(Math.min(n-f2,f3-n));
    }
}

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character>stack1=new Stack<>();
        Stack<Character>stack2=new Stack<>();
        for (int i = 0; i <A.length() ; i++) {
            if(A.charAt(i)=='('){
                stack1.push('(');
            }else if(A.charAt(i)==')'){
                stack2.push(')');
            }else{
                return false;
            }
        }
        if(stack1.size()==stack2.size()){
            return true;
        }
        return false;
    }
}