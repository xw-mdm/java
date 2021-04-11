/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-11
 * Time: 21:02
 */


class Student1{
    private String  name;
    private int age;
    private String sex;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student1(String name, int age, String sex) {
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
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void eat(){
        System.out.println(this.getName());
        System.out.println(this.name+"eat");
    }
    public void show() {
        System.out.println("name:"+name+" " + "age:"+age);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        Student1 stu=new Student1("xiaom",18);
        Student1 stu2=new Student1("xiaom",18,"fdas");
        stu.setName("xiaom");
        System.out.println(stu.getName());
        stu.eat();
    }
}
