package holiday.tasks;

public class ArrayList {

    private Integer[] arrayList;

    private int elementsCount;

    ArrayList(int definedSize) {
        if (definedSize <= 0) {
            System.out.println("The size must be greater than 0.");
            return;
        }
        this.arrayList = new Integer[definedSize];
        this.elementsCount = 0;
    }

    int size(){
        return this.elementsCount;
    }
    void add(Integer newElem) {
        if (arrayList.length - elementsCount == 0) {
            copyArray(1);
        }
        arrayList[elementsCount++] = newElem;
    }

    private int modifyListSize(int n) {
       return this.arrayList.length + n;

    }

    void addByIndex(int index, Integer x) {
        if (index >= this.arrayList.length) {
            System.out.println("The index is out of bounds."); {
                return;
            }
        }

        Integer temp1 = this.arrayList[index];
        arrayList[index] = x;

        Integer temp2;

        for (int i = index; i < this.arrayList.length - 1; i++) {
            temp2 = arrayList[i + 1];
            arrayList[i + 1] = temp1;
            temp1 = temp2;
        }

        copyArray(0);
        this.elementsCount++;
        System.out.println("New actual length of arrayList: " + this.elementsCount);
    }

    private void copyArray(int size) {
        size = modifyListSize(size);

        Integer[] tempArray = new Integer[size];

        int tempIndex = 0;

        for (int i = 0; i < this.arrayList.length; i++, tempIndex++) {
            if (this.arrayList[i] == null) { //Re-arrange array if index equals or greater than actual elementsCount
                tempIndex--;
                continue;
            }
            tempArray[tempIndex] = this.arrayList[i];
        }

        this.arrayList = tempArray;

    }

    Integer getByIndex(int index) {
        if (index < elementsCount) {
            return arrayList[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    void deleteByIndex(int index) {
        if (index >= elementsCount) {
            throw new ArrayIndexOutOfBoundsException();
        }
        else {
            Integer num = arrayList[index];
            System.out.println("We are going to delete the element: " + num);
            arrayList[index] = null;
            int temp = index;
            while(temp < elementsCount) {
                arrayList[temp] = arrayList[temp+1];
                arrayList[temp+1] = null;
                temp++;
            }
            elementsCount--;
            System.out.println("After deleting the element, the actual list length: " + elementsCount);
        }
    }
}

