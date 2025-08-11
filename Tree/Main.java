public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new  BinarySearchTree();
        tree.root = new Node(10);
        tree.root.left = new Node(11);
        tree.root.right = new Node(12);
        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(14);

        tree.inorder(tree.root);
        
    }
}
