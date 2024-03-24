public class Node {

    int key;

    Node left, right;

    public Node(int value) {
        key = value;
        left = right = null;
    }

}

class BinaryTree {

    Node root;

    public void buildTree(Node node) {
        if(node != null) {
            buildTree(node.left);
            System.out.println("" + node.key);
            buildTree(node.right);

        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.println("\nBinary Tree :- ");

        tree.buildTree(tree.root);
    }
}
