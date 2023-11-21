import java.util.Scanner;
class Node {
    char data;
    Node left, right;

    Node(char item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    static int preIndex = 0;

    Node constructTree(char[] preOrder) {
        if (preOrder[preIndex] == '#') {
            preIndex++;
            return null;
        }

        Node node = new Node(preOrder[preIndex++]);

        node.left = constructTree(preOrder);
        node.right = constructTree(preOrder);

        return node;
    }

    void printPreorder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data);
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printInorder(Node node) {
        if (node == null)
            return;

        printInorder(node.left);
        System.out.print(node.data);
        printInorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data);
    }

    int countNodes(Node node) {
        if (node == null)
            return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    int countLeaves(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }
}
public class tree {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        char[] preOrder = sc.nextLine().toCharArray();
        Node root = tree.constructTree(preOrder);
        tree.printPreorder(root);
        System.out.println();
        tree.printInorder(root);
        System.out.println();
        tree.printPostorder(root);
        System.out.println();
    }
}