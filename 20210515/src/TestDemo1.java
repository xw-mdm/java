import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-15
 * Time: 9:43
 */

class Stack<T>{
    public T[] elem;
    public int top;
    public Stack() {
        this.elem =(T[])new Object();
    }
    public T[] getElem() {
        return elem;
    }
    public void setElem(T[] elem) {
        this.elem = elem;
    }
    public int getTop() {
        return top;
    }
    public void setTop(int top) {
        this.top = top;
    }
}
//泛型的上界
class Algorimithm<T extends Comparable<T>>{
    public T findMax(T[] array){
        T max=array[0];
        for (int i = 0; i < array.length ; i++) {
            if(array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }
}
//
class  student  implements Comparable<student>{
    public  int age;
    public  String []name;


    @Override
    public int compareTo(student o) {
        return 0;
    }
}


public class TestDemo1 {
    Collection
    public static void main(String[] args) {
        Algorimithm<Integer>algorimithm=new Algorimithm<>();
        Integer[] array={13,5,9,16};

        System.out.println(algorimithm.findMax(array));
    }
}
