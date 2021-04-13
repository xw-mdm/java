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
    //在pos位置新增元素
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
    //打印顺序表
    public void display(){
        for (int i = 0; i <usedSize ; i++) {
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
    //判断顺序表是否满了
    public boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }

    //判定是否包含某个元素
    public  boolean contains (int toFind ){
        for (int i = 0; i <usedSize ; i++) {
            if(elem[i]==toFind)
            return true;
        }
       return false;
    }
    //查找某个元素对应的位置
    public int  search(int toFind) {
        if(contains(toFind)==true){
        int i = 0;
            for (; i <usedSize ; i++) {
                if (elem[i] == toFind)
                return i;
            }
        }
        return -1;
    }
        //获取pos位置的元素
    public  int getPos(int pos){
        //判断pos是否合法
        if(pos<0||pos>=this.usedSize) {
            return -1;
        }
        return this.elem[pos];
    }
    //给pos位置的元素设置为value
    public void setPos(int pos,int value){
        if(pos<0||pos>=this.usedSize) {
            System.out.println("pos不合法");
        }else{
            elem[pos]=value;
        }
    }
    //删除第一次出现的关键字
    public  void remove(int toRemove){
         int index=search(toRemove) ;
         if(index==-1){
             System.out.println("你要删的不存在");
         }
        int i=index;
        for (; i <this.usedSize-1 ; i++) {
            elem[i]=elem[i+1];
            }
        this.usedSize--;
        }
  //获取顺序表大小
    public  int size(){
     return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        usedSize=0;
        System.out.println("顺序表已经清空！");
    }
}
