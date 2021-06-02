/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-20
 * Time: 19:58
 */
public class Hushbuck {

    static class Node {
        public int key;
        public int value;
        public Node next;
        public Node(int key,int value) {
            this.key = key;
            this.value = value;
        }
    }

    public Node[] array;
    public int usedSize;

    public Hushbuck() {
        this.array = new Node[8];
    }

    public void put(int key,int value) {
        int index = key%array.length;
        Node cur = array[index];
        while (cur != null) {
            if(cur.key == key) {
                cur.value = value;
                return;
            }
            cur = cur.next;
        }
        //头插法
        /*Node node = new Node(key,value);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
        if(loadFactor() >= 0.75) {
            //扩容-》 重新哈希
            resize();
        }*/
        //尾插法
        Node node = new Node(key,value);
        if(array[index]==null){
            array[index]=node;
        }else {

            cur.next = node;
        }
        this.usedSize++;
        if(loadFactor() >= 0.75) {
            //扩容-》 重新哈希
            resize();
        }

    }

    public void resize() {
        Node[] newArray = new Node[array.length*2];
        //重新遍历数组里面的每个节点 进行重新的哈希
        for (int i = 0; i < this.array.length; i++) {
            Node cur = array[i];
            while (cur != null) {
                int index = cur.key % newArray.length;
                Node curNext = cur.next;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = curNext;
            }
        }
        this.array = newArray;
    }

    public double loadFactor() {
        return this.usedSize*1.0 / array.length;// 6 / 8
    }

    public int get(int key) {
        //1、通过key找打位置
        int index = key % this.array.length;
        Node cur = array[index];
        while (cur != null) {
            if(cur.key == key) {
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;//
    }

}

