package testdemo;

import java.util.LinkedList;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-28
 * Time: 15:21
 */
//约瑟夫问题
public class Joseph {
    public static int getResult(int n) {
        // write code here
        if (n < 1) {
            return -1;
        }
        LinkedList<Integer> idList = new LinkedList<>();
        for(int i = 1; i <= n; i ++){
            idList.add(i);
        }
        int j = 2;
        while(j <= n){
            int len = idList.size();
            int k = 1;
            for(int i = 1; i <= len; i++){
                if (i % j != 1) {
                    idList.remove(i - k);
                    k++;
                }
            }
            if(idList.size() <= j){
                return idList.getLast();
            }
            j++;
            idList.addFirst(idList.removeLast());
        }
        return 1;
    }
}
