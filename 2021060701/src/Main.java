import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-07
 * Time: 15:23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        ArrayList<String> list =new ArrayList<>();
        String str = scanner.nextLine();
        int i = 0;

        while(i <str.length() ) {
            String str1="";
            if (str.charAt(i) == '"' ) {
                i++;
                while(i<str.length()&&str.charAt(i) != '"' ){
                    str1+=str.charAt(i);
                    i++;
                }
                i++;
                list.add(str1);
                str1="";
            }else if(str.charAt(i)==' '){
                i++;
                while(i<str.length()&&str.charAt(i) != ' ' ){
                    str1+=str.charAt(i);
                    i++;
                }
                System.out.println(str1);
                i++;
                list.add(str1);
                str1="";
            }

        }
        System.out.println(list.size());
        for (int j = 0; j <list.size() ; j++) {
            System.out.println(list.get(j));


        }

    }
}
