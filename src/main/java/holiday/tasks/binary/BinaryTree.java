package holiday.tasks.binary;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Binary Search Tree
public class BinaryTree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

     BinaryTree createBinaryTree() {
        BinaryTree tree = new BinaryTree();
        tree.add(2);
        tree.add(4);
        tree.add(6);
        tree.add(18);
        tree.add(14);
        tree.add(23);
        tree.add(28);
        tree.add(25);
        tree.add(26);
        tree.add(9);
        tree.add(34);
        tree.add(47);

        return tree;
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(int value) {
        if (containsNode(value)) {
            root = deleteRecursive(root, value);
        } else {
            System.out.println("\nOur binary tree does not contain the node you are going to delete.");
        }
    }

    // Breadth-First Search
    public void traverseLevelOrder() {
        if (root == null) {
            return;
        }

        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {

            Node node = nodes.remove();

            System.out.print(node.value + " ");

            if (node.left != null) {
                nodes.add(node.left);
            }

            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

    //Using recursive method

    Node findNode(Node root, int val) {
        if (containsNode(val)) {
            if (root == null || root.value == val) return root;
            return (val < root.value) ? findNode(root.left, val) : findNode(root.right, val);
        } else {
            System.out.println("\nOur binary tree does not contain the node you are looking for.");
        }
        return null;
    }

    //Avoiding recursive method
    Node searchNode(Node root, int val) {
        if (containsNode(val)) {
            List<Node> helperList = new ArrayList<>();
            helperList.add(root);
            while (!helperList.isEmpty()) {
                if (helperList.get(0).value == val) {
                    return helperList.get(0);
                } else {
                    if (helperList.get(0).left != null) {
                        helperList.add(helperList.get(0).left);
                    }
                    if (helperList.get(0).right != null) {
                        helperList.add(helperList.get(0).right);
                    }
                    helperList.remove(0);
                }
            }
        } else {
            System.out.println("\nOur binary tree does not contain the node you are looking for.");
        }
        return null;
    }
}
