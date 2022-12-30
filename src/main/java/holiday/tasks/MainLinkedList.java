package holiday.tasks;

public class MainLinkedList {

    static Node root;

    public static void main(String[] args) {
        // Task 1 modification:
        int [] arr = {9, 18, 23, 2, 6};
        int n = arr.length;
        Node root = arrayToLinkedList(arr, n);
        System.out.println("ArrayToLinkedList: ");
        printList(root);
        System.out.println();

        //Task 1
        LinkedList myList = new LinkedList();
        myList.insert(9);
        myList.insert(18);
        myList.insert(23);
        myList.insert(2);
        myList.insert(6);
        int ourNumber = 8;
        int ourIndex = 3;
        if (ourIndex >= myList.size()) {
            System.out.println("Invalid index to insert data.");
        } else {
            myList.insertNth(ourNumber, ourIndex);
            System.out.println("We have inserted number " + ourNumber + " at the position " + ourIndex + " :");
        }
        myList.printMyList();

        LinkedList secList = new LinkedList();
        secList.insert(9);
        secList.insert(18);
        secList.insert(23);
        secList.insert(2);
        secList.insert(6);
        int secIndex = 2;
        if (secIndex >= secList.size()) {
            System.out.println("Invalid index to get data.");
        } else {
            int ourNum = secList.getByIndex(secIndex);
            System.out.println("Element at index " + secIndex + "  is -> " + ourNum);
        }
        if (secIndex >= secList.size()) {
            System.out.println("Invalid index to delete data.");
        } else {
            secList.deleteByIndex(secIndex);
            System.out.println("Just now we have deleted element at the index " + secIndex + " :");
        }
        secList.printMyList();
    }

    static Node create(int num, Node root) {

        Node temp = new Node();
        temp.data = num;
        temp.nextNode = root;
        root = temp;

        return root;
    }

    static Node arrayToLinkedList(int [] arr, int arrLength) {

        root = null;
        for (int i = arrLength-1; i >= 0; i--) {
            root = create(arr[i], root);
        }
        return root;
    }
    static void printList(Node root) {

        while (root != null) {
            System.out.print(root.data + " ");
            root = root.nextNode;
        }
    }
}

