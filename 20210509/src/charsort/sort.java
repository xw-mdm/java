package charsort;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-09
 * Time: 17:24
 */
public class sort {
    public static void main(String[] args) {
        int a[]={10,2,4,6,5};
        for( int i=1;i<a.length;i++){
            int tmp=a[i];
            int j = i-1;
            for (; j>=0 ; j--) {
                if(a[j]>tmp){
                    a[j+1]=a[j];
                }else {
                    break;
                }
            }
            a[j+1]=tmp;
        }
        System.out.println(a.toString());
    }
}
