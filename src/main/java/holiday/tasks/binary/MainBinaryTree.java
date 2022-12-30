package holiday.tasks.binary;

public class MainBinaryTree {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree = tree.createBinaryTree();

        tree.traverseLevelOrder();

        int delValue = 47;
        tree.delete(delValue);
        System.out.println();
        tree.traverseLevelOrder();

        int ourValue = 23;
        Node withRecursive = tree.findNode(tree.root, ourValue);
        if (withRecursive != null)
            System.out.println("\nWe found the node with value of " + withRecursive.value + " in our BinaryTree.");

        int secValue = 18;
        Node withHelperList = tree.searchNode(tree.root, secValue);
        System.out.println("We found also the node with value of " + withHelperList.value + " in our BinaryTree.");
    }
}
