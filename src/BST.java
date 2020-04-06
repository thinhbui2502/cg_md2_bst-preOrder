public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void preOrder (Node node) {
        if (node != null) {
            System.out.println(node.element);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void preOrder() {
        preOrder(root);
    }
}

