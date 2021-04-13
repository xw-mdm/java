/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-10
 * Time: 14:02
 */

/**
 *
 * 类的加载   加载到jvm中   双亲委派模型：
 */
/*class Person{
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
        static int i=0;   //无法编译   静态不能定义成局部变量
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
    public void eat(){
        System.out.println(this.name+" eat");
    }
    public static void sleep(){
        System.out.println("sleep");
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Person per=new Person("wang",18,"nan");
        per.eat();
        Person.sleep();
        per.setAge(19);
        System.out.println(per.getAge());
    }*/

class Calculator{
   public  int num1;
   public  int num2;
   public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add(){
       return num1+num2;
   }
   public int sub(){
       return num1-num2;
   }
   public int mul(){
       return num1*num2;
   }
   public double dev(){
       return (num1*1.0)/(num2);
   }
}
public  class TestDemo {
    /*public static void main2(String[] args) {
        Calculator calculator=new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println(calculator.add());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
        }
    }
}*/
    //顺序表   静态顺序表  动态顺序表
    //底层是一个数组。




    public static void main(String[] args) {
        MyArray myArray=new MyArray();
        myArray.add(0,1);
        myArray.add(1,2);
        myArray.add(2,3);
        myArray.add(3,4);
        myArray.add(4,5);
        myArray.display();
        myArray.add(3,6);
        myArray.display();

    }



}
