public class BST{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    
    //Insert node in binary search tree as per rule
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //left subtree
            root.left=insert(root.left,val);
        }else{
            //right subtree
            root.right=insert(root.right,val);
        }

        return root;
    }

    //search operation in BST
    public static boolean Search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data > key){
            return Search(root.left, key);
        }
        if(root.data < key){
            return Search(root.right, key);
        }
        return false;
    }

    //delete a node in BST
    public static Node delete(Node root,int val){
        if(root.data < val){
            root.right=delete(root.right,val);
        }
        else if(root.data > val){
            root.left=delete(root.left,val);
        }
        else{
            //case: 1 : leaf Node
            if(root.left==null && root.right==null){
                return null;
            }

            //case: 2 : single child
            if(root.left==null){
                return root.right;
            } 
            else if(root.right==null){
                return root.left;
            }

            //case: 3 : two child
            Node IS=findInorderSuccesor(root.right);
            root.data=IS.data;
            root.right=delete(root.data,IS.data);
        }
        return root;
    }
    public static Node findInorderSuccesor(Node root){
        while(!(root.left==null)){
            root=root.left;
        }
        return root;
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

    public static void main(String args[]){
        int values[]={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();


        // if(Search(root, 5)){
        //     System.out.println("Found");
        // }
        // else{
        //     System.out.println("Not Found");
        // }

        root=delete(root,5);
        inOrder(root);
        System.out.println();
    }
}