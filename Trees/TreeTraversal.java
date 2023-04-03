import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node BuildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                //tree is empty
                return null;
            }
            Node newNode=new Node(nodes[idx]);
            newNode.left=BuildTree(nodes);      //build left tree
            newNode.right=BuildTree(nodes);     //build right tree
            return newNode;
        }

        //PreOrder Traversal ----> T.C = O(n)
        // print as ----> ROOT,LEFT,RIGHT
        public static void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);    //print left subtree
            preOrder(root.right);   //print right subtree
        }

        //InOrder Traversal -----> T.C = O(n)
        //print as -----> LEFT,ROOT,RIGHT
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);   //print left subtree
            System.out.print(root.data+" ");
            inOrder(root.right);   //print right subtree
        }

        //PostOrder Traversal -----> T.C = O(n)
        //print as -----> LEFT,RIGHT,ROOT
        public static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.left);   //print left subtree
            postOrder(root.right);   //print right subtree
            System.out.print(root.data+" ");
        }

        //LevelOrder Traversal -----> T.C = O(n)
        //print level by level ---> FIRST,SECOND,THIRD,..
        public static void leverOrder(Node root){
            if(root==null){
                return;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }
        }

    }
    public static void main(String args[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.BuildTree(nodes);
        System.out.println(root.data);

        System.out.print("PreOrder: ");
        tree.preOrder(root);
        System.out.println();

        System.out.print("InOrder: ");
        tree.inOrder(root);
        System.out.println();

        System.out.print("PostOrder: ");
        tree.postOrder(root);
        System.out.println();

        System.out.print("LevelOrder: \n");
        tree.leverOrder(root);
        System.out.println();
    }
}


/* BFS (Breath First Search)
 * --> 1) PreOrder  O(n)
 * --> 2) InOrder  O(n)
 * --> 3) PostOrder  O(n)
 * 
 * DFS (Depth First Search)
 * --> LevelOrder  O(n)
 */