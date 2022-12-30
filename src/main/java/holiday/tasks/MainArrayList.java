package holiday.tasks;

public class MainArrayList {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList(10);
        myList.add(2);
        myList.add(6);
        myList.add(9);
        myList.add(18);
        myList.add(23);
        myList.add(25);
        myList.add(28);
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.getByIndex(i) + " ");
        }
        int ourIndex = 3;
        int toAdd = 4;
        if (ourIndex >=myList.size()) {
            System.out.println("\nInvalid index to get data.");
        } else {
            System.out.println("\nElement at the index " + ourIndex + " is " + myList.getByIndex(ourIndex));
        }
        if (ourIndex >=myList.size()) {
            System.out.println("Invalid index to insert data.");
        } else {
            System.out.println("We will add at the index " + ourIndex + " an element " + toAdd);
            myList.addByIndex(ourIndex, toAdd);
        }

        int delIndex = 2;
        if (delIndex >=myList.size()) {
            System.out.println("Invalid index to delete data.");
        } else {
            myList.deleteByIndex(delIndex);
        }
        System.out.println("After deleting element at the index " + delIndex + " the list looks like: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.getByIndex(i) + " ");
        }
    }
}
