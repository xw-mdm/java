/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-10
 * Time: 10:47
 */
class Student{
    private   String name;
    private   int age;
    private   String  sex;
    /*public  String getName(){
        return name;
    }
    public void setName(String myname){
          this.name=myname;
    }*/

    //constructor
    public Student(String name, int age, String sex) {
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
    public void setAge(int age) {
        this.age = age;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public  String getSex(){
        return sex;
    }
    public  int getAge(){
        return age;
    }
    public  void eat(){
        System.out.println(name+"eat");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class TestDemo2 {
    //oop  面向对象的编程
    //   继承  封装   多态
    // 封装：使用关键字private  修饰成员变量和成员方法  需要用set 和get
    //静态的方法不能使用this
    public static void main(String[] args) {
        Student student=new Student("wang",18,"kajsld");
       /* student.age=18;
        student.name="wang";
        student.sex="男";*/
        student.setName("wang");
        System.out.println(student.getName());
    }
}
