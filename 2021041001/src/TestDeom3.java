/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-11
 * Time: 20:34
 */
class Person1{
    static  int age=10;


    public  void mm(){
        System.out.println("fdasf");
    }

    public  static void show(){
        System.out.println(age);
        Person1 daf=new Person1();
        daf.mm();
    }
}
public class TestDeom3 {
    public static void main(String[] args) {
        Person1 per=new Person1();
        System.out.println(per.age);
        System.out.println(Person1.age);
        per.show();
        Person1.show();
    }
}
