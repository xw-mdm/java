import sun.plugin2.applet.context.NoopExecutionContext;

import javax.swing.*;
import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * Created with Intellij IDEA
 * Description:
 * User: 23871
 * Date: 2021-04-29
 * Time: 18:33
 */
class Node{
    int val;
    Node left;
    Node right;
    public  Node(int val){
        this.val=val;

    }
}

public class BinarryTree {
    // public  Node root;
    public Node createTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        C.left = F;
        C.right = G;
        E.right = H;
        return A;
    }

    // 前序遍历
    public void preOrderTraversal(Node root) {
        if (root == null) return;

        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    //非递归前序
    public void preTraversal(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node root1 = root;
        while (root1 != null || !stack.isEmpty()) {
            while (root1 != null) {
                System.out.print(root1.val + " ");
                stack.push(root1);
                root1 = root1.left;
            }
            if (!stack.isEmpty()) {
                root1 = stack.pop();
                root1 = root1.right;
            } else
                break;

        }
    }

    //中序
    public void inOrderTraversal(Node root) {
        if (root == null) return;


        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    //非递归中序
    public void inTraversal(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        Node root1 = root;
        while (root1 != null || !stack.isEmpty()) {
            while (root1 != null) {
                stack.push(root1);
                root1 = root1.left;
            }
            if (!stack.isEmpty()) {
                root1 = stack.pop();
                System.out.print(root1.val + " ");
                root1 = root1.right;
            } else
                break;

        }

    }

    // 后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);

        System.out.print(root.val + " ");
    }

    //非递归 后序遍历
    void postTraversal(Node root) {
        if (root == null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();
        Node node1 = root;
        stack1.push(node1);
        while (!stack1.isEmpty()) {
            node1 = stack1.pop();
            stack2.push(node1);
            if (node1.left != null) {
                stack1.push(node1.left);
            }
            if (node1.right != null) {
                stack1.push(node1.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }

    // 遍历思路-求结点个数
    static int size = 0;

    void getSize1(Node root) {
        if (root == null) return;
        getSize1(root.left);
        getSize1(root.right);

        size++;

    }

    // 子问题思路-求结点个数
    int getSize2(Node root) {

        if (root == null) return 0;
        return getSize2(root.left) + getSize2(root.right) + 1;

    }

    // 遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(Node root) {
        if (root == null) return;
        if (root.right == null && root.left == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
    }

    // 子问题思路-求叶子结点个数
    int getLeafSize2(Node root) {
        if (root == null) return 0;
        if (root.right == null && root.left == null) return 1;
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    // 子问题思路-求第 k 层结点个数
    int getKLevelSize(Node root, int k) {
        if (root == null) return 0;
        if (k == 1) return 1;
        return getKLevelSize(root.left, (k - 1)) + getKLevelSize(root.right, (k - 1));
    }

    // 获取二叉树的高度
    int getHeight(Node root) {
        if (root == null)
            return 0;
        return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    Node find(Node root, char b) {
        if (root == null) return null;
        if (root.val == b) {
            return root;
        }
        Node r = find(root.right, b);
        if (r != null) {
            return r;
        }

        r = find(root.left, b);
        if (r != null) {
            return r;
        }

        return null;
    }

    //判断两树是否相同
    public boolean isSameTree(Node p, Node q) {
        if (p == null && q != null) {
            return false;
        }
        if (q == null && p != null) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        return (isSameTree(p.right, q.right) && isSameTree(p.left, q.left));

    }

    public Node mergeTrees(Node root1, Node root2) {
        if (root1 == null)
            return root2;
        else if (root2 == null) {
            return root1;
        } else {
            root1.val += root2.val;
            // 再递归合并左右子树
            root1.left = mergeTrees(root1.left, root2.left);
            root1.right = mergeTrees(root1.right, root2.right);
            return root1;
        }
    }

    //判断 子树
    public boolean isSubtree(Node root, Node subroot) {
        if (root == null) return false;
        if (isSameTree(root, subroot)) return true;
        if (isSubtree(root.right, subroot)) return true;
        if (isSubtree(root.left, subroot)) return true;
        return false;
    }

    //判断高度平衡的二叉树
    public boolean isBlanceTree(Node root) {
        if (root == null) return true;
        int a = getHeight(root.right);
        int b = getHeight(root.left);
        return Math.abs(b - a) < 2 && isBlanceTree(root.left) && isBlanceTree(root.right);

    }

    //判断一个树对称
    public boolean isSystree(Node Lefttree, Node Righttree) {
        if (Lefttree == null && Righttree != null) return false;
        if (Righttree == null && Lefttree != null) return false;
        if (Lefttree == null && Righttree == null) return true;
        if (Righttree.val != Lefttree.val) return false;

        return (isSystree(Lefttree.left, Righttree.right) && isSystree(Lefttree.right, Righttree.left));
    }

    public boolean isSytree(Node root) {
        if (root == null) return true;
        return isSystree(root.left, root.right);
    }

    //层序遍历
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while (count > 0) {
                Node node = queue.poll();
                list.add(node.val);
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
                count--;
            }
            res.add(list);
        }
        return res;
    }

    //判断是完全二叉树
    boolean isCompleteTree(Node root) {
        if (root == null) return true;
        //1、队列
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        //2、网队列扔元素-》 出元素(==null)
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                break;
            }
        }
        //3、继续判断队列，是否有不为空的元素
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            if (cur != null) {
                return false;
            }
        }
        return true;
    }

    //前序创建一棵树
    int i = 0;
    public Node Creatprevtree(String str) {
        Node root = null;
        if (str.charAt(i) != '#') {
            root = new Node(str.charAt(i));
            i++;
            root.left = Creatprevtree(str);
            root.right = Creatprevtree(str);
        } else {
            i++;
        }
        return root;
    }


    //二叉树转化字符串
    public void tree3str(Node root, StringBuilder str1) {
        if (root == null) return;
        str1.append(root.val);
        if (root.left == null) {
            if (root.right == null) {
                return;
            } else {
                str1.append("()");
            }
        } else {
            str1.append("(");
            tree3str(root.left, str1);
            str1.append(")");
        }
        if (root.right == null) {
            return;
        } else {
            str1.append("(");
            tree3str(root.right, str1);
            str1.append(")");
        }
    }

    public String tree2str(Node root) {
        StringBuilder str1 = new StringBuilder();
        if (str1 == null) return str1.toString();
        tree3str(root, str1);
        return str1.toString();

    }

    //二叉树的最大宽度
    public int widetree(Node root) {
        return 1;
    }
    //找出最近公共祖先(lca问题)
    public Node lowestCommonAncestor(Node root,Node p,Node q){
        if(root==null)return null;
        if(p==root||q==root) return root;
        Node lefttree=lowestCommonAncestor(root.left,p,q);
        Node righttree=lowestCommonAncestor(root.right,p,q);
        if(lefttree!=null&&righttree!=null)return root;
        if(lefttree!=null&&righttree==null)return lefttree;
        if(lefttree==null&&righttree!=null)return righttree;
        return null;
    }

    //二叉搜索树   （中序遍历有序）
    Node prev = null;
    public void convertChild(Node pCur) {
        if(pCur == null) {
            return;
        }
        convertChild(pCur.left);
        pCur.left = prev;
        if(prev != null) {
            prev.right = pCur;
        }
        prev = pCur;
        convertChild(pCur.right);
    }

    public Node Convert(Node pRootOfTree) {
        if(pRootOfTree == null) return null;

        convertChild(pRootOfTree);

        Node head = pRootOfTree;

        while(head.left != null) {
            head = head.left;
        }
        return head;
    }
   //前序和中序构建二叉树
    public int preindex=0;
    public  Node buildtreechild(int[] preorder,int[] inorder,int inbegin,int inend){

        if(inbegin>inend){
            return null;
        }
        Node root=new Node(preorder[preindex]);
        int index=findIndex(inorder,inbegin,inend,preorder[preindex]);
        preindex++;
        root.left=buildtreechild(preorder,inorder,inbegin,index-1);
        root.right=buildtreechild(preorder,inorder,index+1,inend);
        return root;
    }
    public int findIndex(int [] inorder,int inbegin,int inend,int key){
        for (int j = inbegin; j <=inend ; j++) {
            if(inorder[j]==key){
                return j;
            }
        }
        return -1;
    }
    public Node buildTree(int[] preorder, int[] inorder) {
        if(preorder==null||inorder==null)return  null;
        return buildtreechild(preorder,inorder,0,inorder.length-1);
    }
}
/*    //后续和中序
class Solution {

    public int preindex=0;
    public  TreeNode buildtreechild(int[] postorder,int[] inorder,int inbegin,int inend){
        if(inbegin>inend){
            return null;
        }
        TreeNode root=new TreeNode(postorder[preindex]);
        int index=findIndex(inorder,inbegin,inend,postorder[preindex]);
        preindex--;
        root.right=buildtreechild(postorder,inorder,index+1,inend);
        root.left=buildtreechild(postorder,inorder,inbegin,index-1);

        return root;
    }
    public int findIndex(int [] inorder,int inbegin,int inend,int key){
        for (int j = inbegin; j <=inend ; j++) {
            if(inorder[j]==key){
                return j;
            }
        }
        return -1;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if(postorder==null||inorder==null)return  null;
        preindex=postorder.length-1;

        return buildtreechild(postorder,inorder,0,inorder.length-1);

    }
}
*/



/*class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val=val;
    }
}*/
/*
public class Main{
    static int i=0;
    public static Node Creatprevtree(String str){
        Node root=null;
        if(str.charAt(i)!='#'){
            root=new Node(str.charAt(i));
            i++;
            root.left=Creatprevtree(str);
            root.right=Creatprevtree(str);
        }else {
            i++;
        }
        return root;
    }
    public static void inOrderTraversal(Node root){
        if(root ==null)return;
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        Node root=Creatprevtree(str);
        inOrderTraversal(root);
    }
}*/
