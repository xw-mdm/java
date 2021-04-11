import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-10
 * Time: 17:26
 */
public class MyArray {
    public  int[] elem;
    public  int usedSize;



    public MyArray() {
        this.elem =new int[10];
    }
    public  void add(int pos,int data){
        //0.判断满了没
        if(usedSize==elem.length){
            System.out.println("数组已满，无法插入");
            return;
        }
        //判断合法性
        else if(pos<0||pos>usedSize){
            System.out.println("坐标不合法");
            return;
        }
        else if(pos==usedSize){
            elem[pos]=data;
            usedSize++;
            return;
        }
        //从后往前挪
        else{
            for(int i=usedSize;i>=pos;i--){
                elem[i+1]=elem[i];
            }
            elem[pos]=data;
            usedSize++;
            return;
        }
    }
    public void display(){
        for (int i = 0; i <usedSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }

}
