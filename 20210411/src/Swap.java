import java.util.Arrays;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-11
 * Time: 11:39
 */
public class Swap {
    static int []a1={5,6,7};
    static int []a2={1,2,3};
    public void sWAP(int[]a1, int[]a2){
        for (int i = 0; i <a1.length ; i++) {
            int tmp=a1[i];
            a1[i]=a2[i];
            a2[i]=tmp;
        }
    }
    public static void main(String[] args) {
        Swap swap=new Swap();
        swap.sWAP(a1,a2);
        System.out.println(Arrays.toString(a1));
    }

}
