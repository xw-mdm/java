import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-29
 * Time: 19:13
 */
public class TestDEmo {
    public static void main(String[] args) {
        BinarryTree binarryTree = new BinarryTree();
        Node root = binarryTree.createTree();
        //binarryTree.preOrderTraversal(root);
        // binarryTree.inOrderTraversal(root);
        /*binarryTree.postOrderTraversal(root);
        binarryTree.getSize1(root);
        System.out.println(BinarryTree.size);
        System.out.println(binarryTree.getSize2(root));
        binarryTree.getLeafSize1(root);
        System.out.println(BinarryTree.leafSize);
        System.out.println(binarryTree.getLeafSize2(root));*/
      //  System.out.println(binarryTree.getKLevelSize(root, 3));
        //System.out.println(binarryTree.find(root, 'B').val);
       System.out.println("前序遍历 递归的方式");
        binarryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("前序遍历 非递归的方式");
        binarryTree.preTraversal(root);
        System.out.println();
        System.out.println("中序遍历 递归的方式");
        binarryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("中序遍历 非递归的方式");
        binarryTree.inTraversal(root);
        System.out.println();
        System.out.println("后序遍历 递归的方式");
        binarryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("后序遍历 非递归的方式");
        binarryTree.postTraversal(root);
        System.out.println(binarryTree.getHeight(root));
        Queue<Node>queue=new LinkedList<>();
        

    }
}
