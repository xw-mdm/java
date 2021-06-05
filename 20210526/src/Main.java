import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-27
 * Time: 14:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.nextLine();
            int max=0;
            int j=0;
            int count=0;
            for (int i = 0; i <str.length() ; i++) {
                if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    count++;
                    if(count>max){
                        max=count;
                        j=i;
                    }
                }else{
                    count=0;
                }
            }
            System.out.println(str.substring(j-max+1,j+1));
        }
    }
}
 class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < array.length ; i++) {
            if(map.get(array[i])==null){

                map.put(array[i],1);
            }
            map.put(array[i],map.get(array[i])+1);
        }
        for (int i = 1; i <10 ; i++) {
            if(map.get(array[i])>array.length/2+1){
                return array[i];
            }

        }
        return 0;

    }
}
