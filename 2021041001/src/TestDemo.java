/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-10
 * Time: 9:02
 */

class Person{
    //属性   成员变量
    /**
     * 普通成员变量
     * 静态成员变量   public static intcount=0；
     * 成员没有初始化   值为默认值
     */
    public String name="zhnagfei ";
    public int age=20;
    public  static int pp=10;  //静态变量    存放在方法区   他的访问不依赖于对象；
    //行为
    public void eat(){
        int a=10;   //局部变量
        System.out.println("eat");
    }

    public void sleep(){ //普通成员方法
        System.out.println("sleep");
    }
    public  static void jkj(){
    }
    public void show(){
          //alt+i
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo {
    /**
     * 类的定义      【访问修饰限定符】（可以省略）  类似于模板    产生的实体就是对象   过程（实例化）   找对象  创对象  适用对象
     * @param args
     */
    public static void main(String[] args) {
        Person per = new Person();    //方法表  -》方法区  （方法名称      方法的地址）
        per.eat();
       // 静态方法   变量通过类名调用
        System.out.println(Person.pp);

       }
    }

