package holiday.tasks;

public class LinkedList {

    private Node head;

    private int size = size();

    int size() {
        int size = 0;
        Node current = head;
        while(current != null) {
            size++;
            current = current.nextNode;
        }
        return size;
    }
    void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if (this.head == null) {
            head = node;
            return;
        }

        Node temp = this.head;
        while (temp.nextNode != null) {
            temp = temp.nextNode;
            size++;
        }
        temp.nextNode = node;
    }
    void insertNth(int data, int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid index.");
            return;
        }
        Node temp = new Node();
        temp.data = data;
        temp.nextNode = null;

        if (this.head == null) {
            if (position == 0) {
                return;
            } else {
                this.head = temp;
            }
        }

        if (position == 0) {
            temp.nextNode = this.head;
            this.head = temp;
            return;
        }

        Node current = this.head;
        Node previous = null;

        int i = 0;

        while (i < position) {
            previous = current;
            current = current.nextNode;

            if (current == null) break;
            i++;
        }

        temp.nextNode = current;
        if (previous != null) {
            previous.nextNode = temp;
        }

        size++;
    }

    void printMyList() {
        if (this.head == null) {
            return;
        }

        while (this.head != null) {
            System.out.print(this.head.data + " ");
            this.head = this.head.nextNode;
        }
        System.out.println();
        System.out.println("Happy end ==> NULL.");
    }

    int getByIndex(int ourIndex) {
        if (ourIndex < 0 || ourIndex >= size) {
            System.out.println("Invalid index.");
            return 0;
        }
        if (this.head == null) {
            System.out.println("Head is null :(");
            return 0;
        }
        Node current = this.head;
        int ourNumber = 0;
        int indexCount = 0;
        while (current != null) {
            if (indexCount == ourIndex) {
                ourNumber = current.data;
                System.out.println("OurNumber: "  + ourNumber);
            }
            indexCount++;
            current = current.nextNode;
        }
        return ourNumber;
    }

    void deleteByIndex(int ourIndex) {
        if (ourIndex < 0 || ourIndex >= size) {
            System.out.println("Invalid index.");
            return;
        }

        if (this.head == null) {
            System.out.println("Head is already null :(");
            return;
        }

        Node temp = head;

        if (ourIndex == 0) {
            head = temp.nextNode;
            return;
        }

        for (int i=0; temp != null && i < ourIndex-1; i++) {
            temp = temp.nextNode;
        }

        if (temp == null || temp.nextNode == null)
            return;

        temp.nextNode = temp.nextNode.nextNode;
        size--;
    }
}
