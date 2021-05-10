package testdemo;

import java.util.Stack;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-28
 * Time: 18:33
 */
public class Solution {
    public static boolean backspaceCompare(String s, String t){
        char[] t1=t.toCharArray();
        char[] s1=s.toCharArray();
        Stack<Character> t2=new Stack<>();
        Stack<Character> s2=new Stack<>();
        for (int i = 0; i <t1.length ; i++) {
            if(t1[i]!='#'){
                t2.push(t1[i]);
            }else{
                if(t2.empty()){
                    continue;
                }else{
                    t2.pop();
                }
            }
        }
        for (int i = 0; i <s1.length ; i++) {
            if(s1[i]!='#'){
                s2.push(s1[i]);
            }else{
                if(s2.empty()){
                    continue;
                }else{
                    s2.pop();
                }
            }
        }
        return t2.equals(s2);
    }

    public static void main(String[] args) {
        String s1="##c";
        String s2= "a#c";
        System.out.println(backspaceCompare(s1, s2));
    }
}
