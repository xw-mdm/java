/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-06-07
 * Time: 20:54
 */
class  a{

}
class  b extends  a{

}
public class Test {
    public static void main(String[] args) {
       b b=new b();
       a a=b;
       if(a instanceof b){
           b b1=(b)a;
       }



    }
}
