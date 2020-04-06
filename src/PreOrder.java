public class PreOrder {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.root = new Node(50);
        bst.root.left = new Node(39);
        bst.root.right = new Node(56);
        bst.root.left.left = new Node(30);
        bst.root.left.right = new Node(41);
        bst.root.right.left = new Node(55);
        bst.root.right.right = new Node(57);
        bst.root.right.right.left = new Node(51);
        bst.root.right.right.right = new Node(60);

        bst.preOrder();
    }
}
