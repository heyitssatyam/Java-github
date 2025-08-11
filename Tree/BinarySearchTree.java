class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;
    
    BinarySearchTree(){
        root = null;
    }

    void inorder(Node root){
        if(root ==null){
            return;
        }
        inorder(root.left);
        System.out.print( root.data + " ");
        inorder(root.right);
    }

    void addElement(int data){
        Node newnode= new Node(data);

        if(root == null){
            root = newnode;
        }
        else{
            Node curr = root;
            while(curr.left != null && curr.right !=null){
                if(data < curr.data){
                    curr=curr.left;
                }
                else{
                    curr=curr.right;
                }
            }
            if(data < curr.data){
                curr.left = newnode;
            }
            else{
                curr.right = newnode;
            }
        }
    }ō
    
}
