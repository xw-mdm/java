package Test;

import java.util.HashMap;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-05-17
 * Time: 14:55
 */

/*
hash  哈希方法  散列函数
 */

public class hashmap {


    public static class Node{
        int key;
        int val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node[] array;
    public  int usedsize;
    public  hashmap(){
        this.array=new Node[8];
    }
    public void put(int key,int value){

    }
    public static void main(String[] args) {
        System.out.println();
        HashMap<Character,Character>hashMap=new HashMap<>();
        hashMap.put()
    }
}
